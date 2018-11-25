package cn.com.taiji.test;

import cn.com.taiji.bean.another;
import cn.com.taiji.bean.helloword;
import cn.com.taiji.bean.lifebean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    //xml配置方式注入bean
    @Test
    public void test() {
        //引入ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //执行销毁
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        //计算出bean的个数
        int count = context.getBeanDefinitionCount();
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("注入的bean有：" + name);
        }

        System.out.println("bean的个数:" + count);
        //测试导入helloword
        helloword name = (helloword) context.getBean("hello");
        name.sayHello();
        //测试导入lifebean
        lifebean life = (lifebean) context.getBean("lifebean");
        //测试导入another
        another another = (another) context.getBean("another");
        //spring的IOC的setter方式注入属性值
        System.out.println("setter方式注入属性值:" + another.getBeanOne().getName().toString());
        //spring的IOC的构造器方式注入属性值
        System.out.println("构造器方式注入属性值:" + another.getBeanTwo().getAge());

    }

    //注解方式注入bean
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //执行销毁
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        //计算出bean的个数
        int count = context.getBeanDefinitionCount();
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("注入的bean有：" + name);
        }

        System.out.println("bean的个数:" + count);
        //测试导入helloword
        helloword name = (helloword) context.getBean("hello");
        name.sayHello();
        another another = (another) context.getBean("another");
        System.out.println("setter方式注入属性值:" + another.getBeanOne().getName().toString());
        //spring的IOC的构造器方式注入属性值
        System.out.println("构造器方式注入属性值:" + another.getBeanTwo().getAge());

    }

    //扫描java类配置方式
    @Test
    public void test3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("cn.com.taiji.bean");
        context.refresh();
        context.registerShutdownHook();
        int count = context.getBeanDefinitionCount();
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("注入的bean有：" + name);
        }

        System.out.println("bean的个数:" + count);
        //测试导入helloword
        helloword name = (helloword) context.getBean("hello");
        name.sayHello();
        another another = (another) context.getBean("another");
        System.out.println("setter方式注入属性值:" + another.getBeanOne().getName().toString());
        //spring的IOC的构造器方式注入属性值
        System.out.println("构造器方式注入属性值:" + another.getBeanTwo().getAge());
    }

    //java配置方式
    @Test
    public void test4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.com.taiji.bean");
        //执行销毁
        context.registerShutdownHook();
        int count = context.getBeanDefinitionCount();
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("注入的bean有：" + name);
        }

        System.out.println("bean的个数:" + count);
        //测试导入helloword
        helloword name = (helloword) context.getBean("hello");
        System.out.println(name.getName());
        name.sayHello();
        another another = (another) context.getBean("wang");
        System.out.println("setter方式注入属性值:" + another.getBeanOne().getName().toString());
        //spring的IOC的构造器方式注入属性值
        System.out.println("构造器方式注入属性值:" + another.getBeanTwo().getAge());

    }
}

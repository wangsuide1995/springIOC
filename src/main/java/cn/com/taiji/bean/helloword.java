package cn.com.taiji.bean;

import org.springframework.stereotype.Service;

@Service(value = "hello")
public class helloword {

    private String name = "王绥德";
    private int age = 123;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello Spring...");
    }
}

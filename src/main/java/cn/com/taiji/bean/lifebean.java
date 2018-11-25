package cn.com.taiji.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class lifebean implements InitializingBean,DisposableBean {

    private void start() {
        System.out.println("开始。。。");
    }

    private void stop() {
        System.out.println("结束。。。");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("结束。。。");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("开始。。。");
    }
}

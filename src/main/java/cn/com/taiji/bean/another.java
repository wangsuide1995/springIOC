package cn.com.taiji.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "another")
public class another {

    @Autowired
    private helloword beanOne;
    @Autowired
    private helloword beanTwo;

    public another() {
    }

    public another(helloword beanTwo) {
        super();
        this.beanTwo = beanTwo;
    }

    public helloword getBeanOne() {
        return beanOne;
    }

    public void setBeanOne(helloword beanOne) {
        this.beanOne = beanOne;
    }

    public helloword getBeanTwo() {
        return beanTwo;
    }

    public void setBeanTwo(helloword beanTwo) {
        this.beanTwo = beanTwo;
    }
}

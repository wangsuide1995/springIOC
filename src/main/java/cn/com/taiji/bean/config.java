package cn.com.taiji.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean(value = "hello")
    public helloword bean(){
        helloword hello = new helloword();
        return hello;
    }

    @Bean(value = "wang")
    public another wang(){
        another another = new another();
        return another;
    }
}

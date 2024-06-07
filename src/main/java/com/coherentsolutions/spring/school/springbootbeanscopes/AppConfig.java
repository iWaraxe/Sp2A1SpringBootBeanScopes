package com.coherentsolutions.spring.school.springbootbeanscopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class AppConfig {

    @Bean(name = "requestBean")
    @RequestScope
    public MyClass requestBean() {
        return new MyClass("Request Bean");
    }

    @Bean(name = "sessionBean")
    @SessionScope
    public MyClass sessionBean() {
        return new MyClass("Session Bean");
    }
}

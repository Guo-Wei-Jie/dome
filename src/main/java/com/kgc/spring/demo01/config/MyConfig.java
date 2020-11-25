package com.kgc.spring.demo01.config;

import com.kgc.spring.demo01.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}

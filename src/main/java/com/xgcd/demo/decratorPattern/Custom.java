package com.xgcd.demo.decratorPattern;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Custom {

    @Bean
    public Children getChild() {
        return new Children();
    }

}

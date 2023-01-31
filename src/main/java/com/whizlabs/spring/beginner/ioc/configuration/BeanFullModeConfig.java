package com.whizlabs.spring.beginner.ioc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFullModeConfig {
    @Bean
    public Name getName(){
        return new Name("zozo", "toto");
    }

// This is called dependency injection
    @Bean
    public Person getPerson(){
        return new Person(getName());
    }// here is dependency injection
}

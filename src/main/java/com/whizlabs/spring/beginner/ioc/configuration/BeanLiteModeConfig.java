package com.whizlabs.spring.beginner.ioc.configuration;

import org.springframework.context.annotation.Bean;

public class BeanLiteModeConfig {
    @Bean
    public Name getName(){
        return new Name("zozo", "toto");
    }

    @Bean
    public Person getPerson(){
        return new Person(getName());// here is dependency injection
    }

}

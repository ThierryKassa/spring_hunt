package com.whizlabs.spring.beginner.ioc.introduction;


import org.springframework.context.annotation.Bean;

public class IntroductionConfig {
    @Bean

    public Person getPerson(){

        return new Person("Jane Roe");
    }
}

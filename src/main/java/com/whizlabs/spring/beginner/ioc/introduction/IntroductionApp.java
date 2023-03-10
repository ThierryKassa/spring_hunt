package com.whizlabs.spring.beginner.ioc.introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IntroductionApp {
    public static void main(String[] args) {
        Person john = new Person("John Doe");
        System.out.println(john.getFullname());

        ApplicationContext context = new AnnotationConfigApplicationContext(IntroductionConfig.class);
        Person jane = context.getBean(Person.class);
        System.out.println(jane.getFullname());
    }
}

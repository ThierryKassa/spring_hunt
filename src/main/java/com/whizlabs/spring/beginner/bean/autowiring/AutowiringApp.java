package com.whizlabs.spring.beginner.bean.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutowiringConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
//This is the use of @Autowired in Person to call out the person address and age
        System.out.println(person.getAddress());
        System.out.println(person.getAge());
    }
}

package com.whizlabs.spring.beginner.ioc.scanning;

import com.whizlabs.spring.beginner.ioc.scanning.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanningApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ScanningConfig.class);
        Person person1 = (Person) context.getBean("person");
        person1.setFullName("John Dove");
        Person person2 = context.getBean(Person.class);
        System.out.println(person2.getFullName());

    }
}

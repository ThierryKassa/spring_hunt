package com.whizlabs.spring.beginner.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        Person person1 = context.getBean(Person.class); // person1 and person2 are prototype scope, means every instance of person is different to another
        Person person2 = context.getBean(Person.class);
        System.out.println(person1 == person2);

        Address address1 = person1.getAddress(); // Address is are singleton scope, so address1 and address2 refers to the same object
        Address address2 = person2.getAddress();
        System.out.println(address1 == address2);

        System.out.println(person1.getAddress().getStreet());
        System.out.println(person2.getAddress().getStreet());
    }
}

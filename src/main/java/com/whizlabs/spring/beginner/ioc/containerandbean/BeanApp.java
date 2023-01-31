package com.whizlabs.spring.beginner.ioc.containerandbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {
    public static void main(String[] args) {
// calling spring container with XML configuration
        ApplicationContext contextWithXmlConfig = new ClassPathXmlApplicationContext("ioc/basic-config.xml");
        Person john = (Person) contextWithXmlConfig.getBean("person");
        System.out.println(john.getFullName());
        System.out.println(john.getAddress());

// calling spring container with java configuration
        ApplicationContext contextWithJavaConfig = new AnnotationConfigApplicationContext(BeanConfig.class);
       // Address address1 = (Address) contextWithJavaConfig.getBean("Cotonou");
        Address address1 = contextWithJavaConfig.getBean("Cotonou", Address.class);
        Address address2 = contextWithJavaConfig.getBean("Lom Nava", Address.class);
        System.out.println(address1==address2);

        Person toto = contextWithJavaConfig.getBean(Person.class);
        System.out.println(toto.getFullName());
        System.out.println(toto.getAddress());

    }
}

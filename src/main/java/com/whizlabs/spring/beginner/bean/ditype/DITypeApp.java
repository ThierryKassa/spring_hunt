package com.whizlabs.spring.beginner.bean.ditype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DITypeApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DITypeConfig.class);
        Persone pop = context.getBean(Persone.class);
        System.out.println(pop.getName());
        System.out.println(pop.getAddress().getStreet());
        System.out.println(pop.getOccupation().getJobTitle());


    }
}

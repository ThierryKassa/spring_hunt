package com.whizlabs.spring.beginner.ioc.containerandbean;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean({"Cotonou", "Lom Nava"})
    Address getAddress(){
        return new Address(200, "Lom Nava");
    }

    @Bean
    Person getPerson(){
        Person person = new Person();
        person.setFullName("Zazou Jean");
        person.setAddress(getAddress());// here is dependency injection
        return person;

    }
}

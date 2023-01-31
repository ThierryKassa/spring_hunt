package com.whizlabs.spring.beginner.bean.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("bean/person.properties")// The properties file must be created at the root the folder resources

public class AutowiringConfig {
    @Bean
    public Name getName(){
        return new Name ("Rod", "Johnson");
     }

    @Bean
    public Address getAddress(){
        return new Address(100, "Abokikodji");
    }

     @Bean
     public Person getPerson(){
        return new Person(getName());// here is DI
     }


}

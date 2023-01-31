package com.whizlabs.spring.beginner.bean.ditype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DITypeConfig {
    @Bean
    public Name getName(){

        return new Name("Toto", "Kane");
    }

    @Bean
    public Address getAddress(){
        return new Address("Cocodji");
    }

    @Bean
    public Occupation getOccupation(){
        return new Occupation("Java Developer");
    }
}

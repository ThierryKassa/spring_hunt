package com.whizlabs.spring.beginner.bean.finetuning.jeeannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class JeeConfig {

    @Bean
    public Identity getIdentity(){
        return new Identity("Kokou Ola");
    }

    @Bean
    public Location getLocation(){
        return new Location("Agblangandan");
    }
}

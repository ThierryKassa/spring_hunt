package com.whizlabs.spring.beginner.bean.callback;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CallbackApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(CallbackConfig.class);
        context.registerShutdownHook();
    }
}

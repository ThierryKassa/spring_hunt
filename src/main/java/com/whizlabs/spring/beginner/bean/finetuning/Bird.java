package com.whizlabs.spring.beginner.bean.finetuning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bird implements Animal {
    @Override
    public String move() {
        return "Fly";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

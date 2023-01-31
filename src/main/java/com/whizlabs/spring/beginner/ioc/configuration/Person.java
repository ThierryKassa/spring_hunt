package com.whizlabs.spring.beginner.ioc.configuration;

public class Person {
    private Name name;

    public Person(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}

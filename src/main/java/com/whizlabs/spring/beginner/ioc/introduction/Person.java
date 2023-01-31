package com.whizlabs.spring.beginner.ioc.introduction;

public class Person {
    private String fullname;

    public Person(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }
}

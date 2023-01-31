package com.whizlabs.spring.beginner.bean.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Person {
    private Name name;
    private Address address;
    private int age;

    public Person(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

//    @Autowired
//    public void setName(Name name) {
//        this.name = name;
//    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {// here the parameter is a primitive value, thus the autowiring won't work automatically
//        this.age = age;
    @Autowired
    public void setAge(Environment environment) {
        this.age = environment.getProperty("age", Integer.class, 0);
    }
}

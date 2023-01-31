package com.whizlabs.spring.beginner.aop.aspectj;

public class Person {
    private String fulllName;

    public Person(String fulllName) {
        this.fulllName = fulllName;
    }
    public void printFullName(){
        System.out.println("Full Name: "+ fulllName);
    }
}

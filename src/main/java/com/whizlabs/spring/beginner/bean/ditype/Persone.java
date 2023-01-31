package com.whizlabs.spring.beginner.bean.ditype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persone {
    private final Name name;
    private Address address;
// we create a field-based injection here, good to avoided it
    @Autowired
    private Occupation occupation;

// if the class have only one constructor no need to process autowiring
    public Persone(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
// Setter-based injection
    @Autowired
    public void setHome(Address address) {
        this.address = address;
    }

    public Occupation getOccupation() {
        return occupation;
    }
}

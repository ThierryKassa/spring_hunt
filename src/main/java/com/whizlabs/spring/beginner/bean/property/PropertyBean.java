package com.whizlabs.spring.beginner.bean.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertyBean {
    private Environment environment;// Use of the environment interface to retrieve environment property
    private int yearOfStudy;

    public PropertyBean(Environment environment) {
        this.environment = environment;
    }

    public String getCourse(){
        return environment.getProperty("course");
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Value("${year_of_study}")// Use of @Value to retrieve environment property
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}

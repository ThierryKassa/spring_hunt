package com.whizlabs.spring.beginner.bean.finetuning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Creature {
    private Animal cat;
    private Animal bird;
    private Animal dog;
    private Animal fish;
    private Map<String, Animal> animals;

    public Animal getCat() {
        return cat;
    }

    @Autowired
    public void setCat(@Qualifier("catBean")Animal cat) { //The success of cat bean injection
        this.cat = cat;
    }

    public Animal getBird() {
        return bird;
    }

    @Autowired
    public void setBird(Animal bird) {
        this.bird = bird;
    }

    public Animal getDog() {
        return dog;
    }

    @Autowired
    public void setDog(@DogQualifier Animal dog) {
        this.dog = dog;
    }

    public Animal getFish() {
        return fish;
    }
    @Autowired
    public void setFish(@Qualifier("Fish")@Nullable Animal fish) { // Here the beans fish does not exist, so we can a @Qualifier annotation to call it out
        this.fish = fish;                                          // adding @Nullabe, we don't get the exception since the beans fish is not created
    }

    public Map<String, Animal> getAnimals() {
        return animals;
    }
    @Autowired
    public void setAnimals(Map<String, Animal> animals) {
        this.animals = animals;
    }
}

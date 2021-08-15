package com.hrybanov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created");
    }

    @Autowired
    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        System.out.println("Class Person: set surname");
        return surname;
    }

    public int getAge() {
        System.out.println("Class Person: set age");
        return age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}

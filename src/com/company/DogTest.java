package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    static Dog dog;

    @BeforeAll
    static void prepareData(){
        dog = new Dog("Albert", 2);
    }


    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        dog.setName("Nick");
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void setName2() {
        Dog dog = new Dog("",2);
        dog.setName("Nick");
        assertEquals("Nick", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}
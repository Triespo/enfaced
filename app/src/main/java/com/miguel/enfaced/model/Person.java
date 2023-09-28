package com.miguel.enfaced.model;

public class Person {
    private final Age age;
    private final Gender gender;
    private final LocationImage location;

    public Person(Age age, Gender gender, LocationImage location) {
        this.age = age;
        this.gender = gender;
        this.location = location;
    }

    public Age getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public LocationImage getLocation() {
        return location;
    }
}

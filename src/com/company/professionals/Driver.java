package com.company.professionals;

public class Driver extends Person {
    private int experience;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver: " +
                "full name=" + getFullName() + " " +
                "age=" + getAge() + " " +
                "experience=" + experience;
    }
}

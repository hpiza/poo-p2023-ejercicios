package com.iteso.model;

public abstract class Employee {

    public String name;

    public void checkIn() {
        System.out.println("Checking in");
    }

    public abstract double calculateSalary();

    public abstract boolean login();

}

package com.iteso.model;

public class Professor extends Employee implements CanvasUser, CubicleUser {

    private double salary;

    public Professor(double salary) {
        this.salary = salary;
    }

    @Override
    public void addCourse() {

    }

    @Override
    public boolean login() {
        return false;
    }

    @Override
    public void openDoor() {

    }

    @Override
    public double calculateSalary() {
        return this.salary;
    }
}

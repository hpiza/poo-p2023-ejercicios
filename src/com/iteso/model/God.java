package com.iteso.model;

public class God {

    private static God instance = null;

    private God() {
        System.out.println("God was created");
    }

    public static God getInstance() {
        if(instance == null) instance = new God();
        return instance;
    }

    private String name = "Diosito";

    public void changeName(String godName) {
        this.name = godName;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void createWorld(String worldName) {
        System.out.printf("World %s created", worldName);
    }

    public void destroyWorld(String worldName) {
        System.out.printf("World %s destroyed", worldName);
    }

}

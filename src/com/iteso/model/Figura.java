package com.iteso.model;

public enum Figura {
    CORAZON("Corazón"), DIAMANTE("Diamante"),
    ESPADA("Espada"), TREBOL("Trébol");

    private String toString;

    Figura(String toString) {
        this.toString = toString;
    }

    public String toString() {
        return this.toString;
    }

}


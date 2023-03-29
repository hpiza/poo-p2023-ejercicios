package com.iteso.model;

public class Carta {

    private int numero;
    private Figura figura;

    public Carta(int numero, Figura figura) {
        this.numero = numero;
        this.figura = figura;
    }

    public int getNumero() {
        return numero;
    }

    public Figura getFigura() {
        return figura;
    }

    public String toString() {
        return String.format("%d de %s", this.numero, this.figura);
    }
}

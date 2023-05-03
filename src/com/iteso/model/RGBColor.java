package com.iteso.model;

import shapes2d.Rectangle;

public class RGBColor implements Comparable<RGBColor> {

    public int compareTo(RGBColor other) {
        int rgb1 = getRGB();
        int rgb2 = other.getRGB();
        return rgb1 - rgb2;
    }

    // visibilidad default (package)
    // los atributos son públicos dentro de clases del mismo paquete; privados en las demás clases
    int red = 0, green = 0, blue = 0;
    public final String name; // = "undefined";

    public RGBColor() {
        this(127, 127, 127, "Gris");
    }

    public RGBColor(int red, int green, int blue) throws IllegalArgumentException {
        this(red, green, blue, "undefined");
    }

    public RGBColor(int red, int green, int blue, String name) throws IllegalArgumentException {
        this.setBlue(blue);
        this.setGreen(green);
        this.setRed(red);
        this.name = name;
    }

    //Setters:
    public void setBlue(int blue) throws IllegalArgumentException {
        if(blue < 0 || blue > 255) throw new IllegalArgumentException("Componente azul fuera de rango: " + blue);
        //if (blue >= 0 && blue <= 255)
        this.blue = blue;
    }

    public void setGreen(int green) {
        if (green >= 0 && green <= 255)
            this.green = green;
    }

    public void setRed(int red) {
        if (red >= 0 && red <= 255)
            this.red = red;
    }

    /*
    public void setName(String name) {
        if (name != null)
            this.name = name;
    }*/

    //Getters:
    public int getBlue() {
        return this.blue;
    }

    public int getGreen() {
        return this.green;
    }

    public int getRed() {
        return this.red;
    }

    public int getCyan() {
        return 255 - this.red;
    }

    public int getMagenta() {
        return 255 - this.green;
    }

    public int getYellow() {
        return 255 - this.blue;
    }

    public int getRGB() {
        return getRGB(this.red, this.green, this.blue);
    }

    public static int getRGB(int red, int green, int blue) {
        //int g = green << 8;
        //int r = red << 16;
        return blue | (green << 8) | (red << 16);
    }

    public static double toGrayScale(RGBColor c) {
        return 0.299 * c.red + 0.587 * c.green + 0.114 * c.blue;
    }

    @Override
    public String toString() {
        // {red: 18, green: 10, blue: 143, name: 'Azul marino'}
        return String.format("{red: %3d, green: %3d, blue: %3d, name: '%s'", this.red, this.green, this.blue, this.name);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RGBColor)) return false;
        RGBColor color = (RGBColor) obj;
        return this.red == color.red && this.green == color.green && this.blue == color.blue && this.name.equals(color.name);
    }

    public RGBColor clone() {
        return new RGBColor(this.red, this.green,this.blue,this.name);
    }

}

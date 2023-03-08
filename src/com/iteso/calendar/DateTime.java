package com.iteso.calendar;

public class DateTime extends Date {

    private String month;

    private String aField = "Mil";

    public static void main(String[] args) {
        DateTime dt = new DateTime();
        dt.isLeap();
        dt = dt.clone();
        dt.setMonth(3);
        dt.setMonth("Marzo");
        System.out.println(dt.aField);

        Date d = new Date();
        d.isLeap();
        d = d.clone();
        d.setMonth(3);
        System.out.println(d.aField);

        // super, this no existen
        Object obj = d;
        System.out.println(obj);  // toString() de Date


        // ¿d vs obj?

    }

    @Override
    public void aMethod() {
        super.aMethod();
        System.out.println("aMethod in class DateTime");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public DateTime clone() {
        return new DateTime();
        // return super.clone();
    }

    @Override
    public void next() {
        super.next();
    }

    // Aquí no hay sobrescritura, hay sobrecarga: 2 métodos disponibles con el mismo nombre
    public void setMonth(String month) {
        // super.month
        this.month = month;
    }
}

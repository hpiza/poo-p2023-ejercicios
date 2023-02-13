package tests;

import shapes2d.Rectangle;

import javax.swing.*;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 3);     // base = 4, height = 3
        //r1.setBase(4);
        //r1.setHeight(3);
        //r1.base = 4;
        //r1.height = 3;
        r1.print();
        System.out.println("Area de r1: " + r1.area());
        System.out.println("Perímetro de r1: " + r1.perimeter());

        Rectangle r2 = new Rectangle();     // base = 1, height = 1
        r2.setBase(0);                      // base = 1, height = 1
        r2.setHeight(-5);                   // base = 1, height = 1
        r2.setBase(3);                      // base = 3, height = 1
        r2.setBase(-3);                     // base = 3, height = 1
        //r2.base = -2;
        //r2.height = -5;
        r2.print();

        Rectangle r3 = new Rectangle(0, -2);     // base = 1, height = 1
        r3.print();
        r3.setBase(2 * r1.getBase());                       // base = 8, height = 1
        r3.print();
        r3.setHeight(2 * r1.getHeight());                   // base = 8, height = 6
        r3.print();

        Rectangle r4 = new Rectangle(5);                // base = 5, height = 5
        r4.print();

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);

        double a = r1.area();
        String str1 = "El área de " + r1 + " es " + a;
        System.out.println(str1);
        //JOptionPane.showMessageDialog(null, r1);

        Rectangle r5 = new Rectangle(5);
        System.out.println("r5: " + r5);

        System.out.println("¿r4 == r5? " + (r4 == r5));
        System.out.println("¿r4.equals(r5)? " + (r4.equals(r5)));
        System.out.println("¿r3.equals(r5)? " + (r3.equals(r5)));
        String s = "hola!";
        System.out.println("¿r3.equals(s)? " + (r4.equals(s)));

        Rectangle r6 = r1.clone();
        //r6.setBase(15);
        System.out.println(r1);
        System.out.println(r6);
        System.out.println(r1 == r6);
        System.out.println(r1.equals(r6));
        System.out.println(r6.equals(r1));
        System.out.println(r1.equals(r1));
        System.out.println(r1.equals(null));
    }

}

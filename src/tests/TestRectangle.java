package tests;

import shapes2d.Rectangle;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.base = 4;
        r1.height = 3;
        r1.print();

        r2.print();
    }

}

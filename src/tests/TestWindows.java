package tests;

import windows.BasicWindow;
import windows.ExtendedWindow;

public class TestWindows {

    public static void main(String[] args) {
        BasicWindow bw1 = new BasicWindow();
        bw1.display();
        bw1.resize(35, 10);
        bw1.display();
        bw1.resize(-43, -21);
        bw1.display();

        BasicWindow bw2 = new BasicWindow(56, 75, 300, 200);
        bw2.display();
        bw2.resize(-50, 40);
        bw2.display();

        ExtendedWindow ew1 = new ExtendedWindow("An extended window");
        //System.out.println(ew1.title);
        ew1.resize(10, 20);
        ew1.display();

    }
}

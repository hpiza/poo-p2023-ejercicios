package tests;

import com.iteso.math.NegativeNumberFoundException;
import com.iteso.math.Utils;
import com.iteso.model.RGBColor;

public class TestUtils {

    public static void main(String[] args) throws NegativeNumberFoundException {
        RGBColor color = new RGBColor(100, 150, 255);
        System.out.println(color);

        double sr = Utils.squareRoot(3);
        System.out.println("Raíz: " + sr);

        double a = 5, b = 8, c = 2;
        double x = Utils.solve(a, b, c);
        System.out.println("x = " + x);
    }

    public static void main1(String[] args) {
        try {
            double sr = Utils.squareRoot(3);
            System.out.println(sr);
        } catch(NegativeNumberFoundException ex) {
            //System.out.println(ex);
            ex.printStackTrace();
            //System.out.println("Los números negativos no tienen raíz cuadrada");
        }

        double a = 5, b = 4, c = 2;
        double x = 0;
        try {
            x = Utils.solve(a, b, c);
        } catch (NegativeNumberFoundException ex) {
            System.out.println(ex);
        }
        System.out.println("x = " + x);

        double m = Utils.magnitude(3, 4);
        System.out.println(m);
    }

}

import com.iteso.model.God;
import com.iteso.model.RGBColor;
import shapes2d.Rectangle;

import static com.iteso.model.RGBColor.getRGB;
import static java.lang.Integer.parseInt;
import static java.lang.String.format;
import static java.lang.System.identityHashCode;
import static javax.swing.JOptionPane.*;
//import static javax.swing.JOptionPane.showInputDialog;
import static shapes2d.Rectangle.aspectRatio;
import static shapes2d.Rectangle.MAX_BASE;

public class Static {

    public static void main(String[] args) {
        God myGod = God.getInstance();  // new God();
        God yourGod = God.getInstance();
        God noGod = God.getInstance();
        System.out.println(myGod == yourGod);
        System.out.println(yourGod == noGod);
        System.out.println(myGod == noGod);
        System.out.printf("%X, %X, %X\n", identityHashCode(myGod), identityHashCode(yourGod), identityHashCode(noGod));

        System.out.println(noGod);
        myGod.changeName("Gokú");
        System.out.println(yourGod);
        myGod.createWorld("Happy world");

    }

    public static void main1(String[] args) {
        int r = 156, g = 102, b = 65;
        r = parseInt(showInputDialog("Valor rojo:"));

        RGBColor c = new RGBColor(r, g, b, "si quieres");
        int rgb1 = c.getRGB();              // Invocación al método no static: exige crear un objeto
        System.out.println(rgb1);

        int rgb2 = getRGB(r, g, b); // Invocación al método static: se invoca a partir de la clase
        System.out.println(rgb2);
        showMessageDialog(null, format("RGB = %X", rgb2));

        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        System.out.println(MAX_BASE);
        double ratio = aspectRatio(6, 15);
        System.out.println(ratio);

        Rectangle r2 = new Rectangle(3, 12);
        System.out.println(r2);

    }

}

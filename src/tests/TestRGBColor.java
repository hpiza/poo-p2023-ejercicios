package tests;

import com.iteso.model.RGBColor;

public class TestRGBColor {

    public static void main(String[] args) {
        RGBColor c1 = new RGBColor();
        RGBColor c2 = new RGBColor(80, 200, 120, "Esmeralda");
        RGBColor c3 = new RGBColor(220, 20, 60, "Carmesí");
        RGBColor c4 = new RGBColor(18, 10, 143, "Azul Marino");
        RGBColor c5 = new RGBColor(c2.getCyan(), c2.getMagenta(), c2.getYellow(), "Esmeralda impreso");

        System.out.printf("%08X\n",c1.getRGB());
        System.out.printf("%08X\n",c3.getRGB());
        System.out.printf("%08X\n",c4.getRGB());
        System.out.printf("%08X, %24s\n",c2.getRGB(), Integer.toBinaryString(c2.getRGB()));
        System.out.printf("%08X, %24s\n",c5.getRGB(), Integer.toBinaryString(c5.getRGB()));

        System.out.println(c1);  // {red: 18, green: 10, blue: 143, name: 'Azul marino'}
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        RGBColor c6 =  c4.clone();
        System.out.println(c6.equals(c4));

    }
}

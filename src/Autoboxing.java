public class Autoboxing {

    public static void main(String[] args) {
        int i1 = 567;
        Integer I1 = new Integer(i1);
        double d1 = 6.78;
        Double D1 = new Double(d1);

        int i2 = I1.intValue();
        System.out.println(i2);
        double d2 = D1.doubleValue();
        System.out.println(d2);
        int i3 = D1.intValue();
        System.out.println(i3);

        Integer I2 = i1;    // Autoboxing   new Integer(i1)
        int i4 = I2;        // Auto-unboxing   I2.intValue()
        System.out.println(i4);

        Integer I3 = I1 + I2;
        System.out.printf("%6X\n", System.identityHashCode(I3));
        System.out.println(I3);
        I3 = 100;
        System.out.printf("%6X\n", System.identityHashCode(I3));
        System.out.println(I3);

        Number n = I3;
        n = D1;



    }

}

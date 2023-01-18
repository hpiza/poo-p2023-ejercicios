/**
 * Esta es la clase principal de la aplicación
 */
public class HelloWorld {

    /**
     * @param args Almacena los argumentos del programa
     * Este es el método de arranque de toda aplicación Java
     */
    public static void main(String[] args) {
        /* Método para imprimir algo en consola
           Al final añade un Enter
        */
        System.out.println("Hola mundo");   // No olviden el punto y coma
        int añoDeNacimiento = 2023;
        float base = 5.3f, height = 1;      // 5.3 necesita f porque es un double por default, no cabe en float
        System.out.println(base);
        double area = base * height;
        System.out.println(area);
        long millis = 2_147_483_648L;   // necesita L porque 2,147'483,648 no cabe en 32 bits con signo
        int x = 0b1010_1010;
        byte b = (byte) 257;   //  1 0000 0001
        System.out.println(b);
        b = 10; // No necesita cast porque 10 cabe en 8 bits con signo
        System.out.println(b);

        area = base;            // sí se puede: float --> double
        // base = area;         // no se puede: double --> float
        base = (float) area;    // se soluciona con un cast
        millis = x;             // sí se puede: int --> long
        // x = millis;          // no se puede: long --> int
        x = (int) millis;       // se soluciona con un cast
        base = x;               // sí se puede: int --> float
        base = millis;          // sí se puede: long --> float
        //millis = base;        // no se puede: float --> long
        base = 5.3f;
        millis = (long) base;
        System.out.println(millis);

        short s = 100;
        int i = s + 200;  // promoción de tipos: s (short) se promueve a int

        b = 50;
        short j = (short) (s + b);  // b (byte) se promueve a short, pero el operador + devuelve int
        // orden de los tipos: byte - short - int - long - float - double

        char c = 'A';       // es también un entero sin signo de 16 bits: [0..65535]
        System.out.println(c);
        c = 65;
        System.out.println(c);
        c = '\n';
        System.out.println(c);
        c = 'A';
        c++;
        System.out.println(c);
        System.out.println((int) c);
        for (c = 65; c <= 130; c++) {
            System.out.printf("%4d: %c\n", (int) c, c);
        }
        String s1 = "hola";
        System.out.println(s1.length());
        String s2 = "hoja";
        int res = s1.compareTo(s2);
        System.out.println(res);
        res = s2.compareTo(s1);
        System.out.println(res);
        res = s2.compareTo("hoja");
        System.out.println(res);
        boolean eq = s2.equals("hoja");
        System.out.println(eq);

        String s3 = new String("hola");
        eq = s1.equals(s3);
        System.out.println(eq);
        eq = s1 == s3;
        System.out.println(eq);

        String s4 = "hola";
        eq = s1 == s4;
        System.out.println(eq);


    }

}

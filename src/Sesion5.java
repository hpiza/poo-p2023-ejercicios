import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Sesion5 {

    public static void main(String[] args) {
        //leibnizPI();
        arreglos();
    }

    static void arreglos() {
        // int arreglo[100];    ANSI C, memoria estática
        // int* arreglo = (int*) malloc(100 * sizeof(int));   ANSI C, memoria dinámica
        // int* arreglo = new int[100];   C++, memoria dinámica
        int[] arreglo1 = new int[100];
        int arreglo2[] = new int[200];
        int[] arreglo3;
        int N = 100;
        arreglo3 = new int[N];
        N = 50;
        arreglo3 = new int[N];
        System.out.println(arreglo3[3]);

        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = i;
        }
        // arreglo3 = arreglo2
        arreglo3 = arreglo2.clone();
        System.out.println(arreglo2 == arreglo3);                 // false, no apuntan al mismo arreglo
        System.out.println(Arrays.equals(arreglo2, arreglo3));    // true, tienen exactamente el mismo contenido

        arreglo2[3] = 67;
        System.out.println(Arrays.equals(arreglo2, arreglo3));    // false, difieren en el elemento 3

        System.out.println(arreglo2);
        // String s = Arrays.toString(arreglo2);
        System.out.println("arreglo1: " + Arrays.toString(arreglo1));
        System.out.println("arreglo2: " + Arrays.toString(arreglo2));
        System.out.println("arreglo3: " + Arrays.toString(arreglo3));

        String[] arreglo4 = { "public", "static", "void", "main" };
        String[] arreglo5 = new String[4];
        arreglo5[0] = "public"; // ...
        // ciclo for-each
        for(String current: arreglo4) {
            current = current.toUpperCase();
            System.out.println(current);
        }
        System.out.println(Arrays.toString(arreglo4));




    }

    static void leibnizPI() {
        String sumandosStr = JOptionPane.showInputDialog(null, "Ingrese el número de sumandos");
        long sumandos = 0;
        double PI=0;
        try {
            sumandos = Long.parseLong(sumandosStr);
        } catch (Exception e) {
            sumandos = 1000;
        }
        System.out.println(sumandos);
        for(long i=1,den=1,signo=1;i<=sumandos;i++,den+=2,signo*=-1){
            PI += 1.0/den*signo;
        }
        PI *=4;
        JOptionPane.showMessageDialog(null,"Resultado: "+PI);
    }
}

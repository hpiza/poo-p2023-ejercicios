package tests;

import com.iteso.model.Carta;
import com.iteso.model.Figura;

public class TestCarta {

    public static void main(String[] args) {
        Carta c1 = new Carta(10, Figura.CORAZON);
        Figura d = Figura.DIAMANTE;
        Carta c2 = new Carta(5, d);
        Carta c3 = new Carta(6, d);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        Figura d2 = Figura.DIAMANTE;
        System.out.println(d == d2);
        System.out.println(d == Figura.DIAMANTE);
        System.out.println(d == Figura.CORAZON);
    }
}

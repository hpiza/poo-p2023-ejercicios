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

        // Sólo se crea una instancia DIAMANTE (aunque varios apuntadores)
        Figura[] figura = { Figura.DIAMANTE, Figura.DIAMANTE, Figura.DIAMANTE };
        Figura f1 = Figura.DIAMANTE;
        Figura f2 = Figura.DIAMANTE;
        System.out.println(calcularPuntos(f1));
        System.out.println(calcularPuntos(Figura.ESPADA));
        System.out.println(calcularPuntos(Figura.CORAZON));
        System.out.println(calcularPuntos(Figura.TREBOL));
    }

    static int calcularPuntos(Figura f) {
        // Corazón = 8, Diamante = 7, Espada = 5, Trébol = 6
        //if(f == Figura.CORAZON) return 8;
        //if(f == Figura.DIAMANTE) return 7;
        switch(f) {
            case CORAZON: return 8;
            case DIAMANTE: return 7;
            case ESPADA: return 5;
            default: return 6;
        }
        // System.out.println("fuera del alcance");
    }

    /*   public abstract class Employee {
           private String nombre, nss, dirección;
           public abstract double calcularSueldo();
         }
         public class EmpleadoDirecto extends Employee {
           public double calcularSueldo() {}
         }
         public class Contractor extends Employee {
           public double calcularSueldo() { }
         }
         public void pagarSueldo(Employee e) {
            double s = e.calcularSueldo()
            depositar(s)
         }
         // Esquema con enumeraciones
         public enum EmployeeType {
            CONTRACTOR, MANAGER, SALESMAN
         }
         public class Employee {
            private String nombre, nss, dirección;
            private EmployeeType tipoEmpleado;
            public double calcularSueldo() {
                switch(tipoEmpleado) {
                    case CONTRACTOR: bla bla bla
                    case MANAGER: bla bla bla
                    case SALESMAN: bla bla bla
                }
            }
         }
     */

}

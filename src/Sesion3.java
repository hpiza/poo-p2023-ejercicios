import javax.management.MBeanAttributeInfo;
import javax.swing.*;

public class Sesion3 {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //int aPasar = 1 + (int) (24 * Math.random());
        //System.out.println("A pasar: " + aPasar);  // 15
        ejercicio3();
    }

    static void ejercicio3() {
        String lenguaje=JOptionPane.showInputDialog(null,"¿Cuál es tu lenguaje de programación favorito?").toLowerCase();
        if(lenguaje.equals("java")){
            JOptionPane.showMessageDialog(null,"Su lenguaje es el mas popular");
        }
        else if(lenguaje.equals("c")){
            JOptionPane.showMessageDialog(null,"Su lenguaje es el segundo mas popular");
    }
        else if(lenguaje.equals("c++")){
            JOptionPane.showMessageDialog(null,"Su lenguaje es el tercero mas popular");
        }
        else{
            JOptionPane.showMessageDialog(null,"Su lenguaje no es popular o no existe)");
        }
}
    static void ejercicio2() {
        // El alcance no incluye validación de los datos de entrada. HIPÓTESIS: todo se captura correctamente
        String velocidadStr = JOptionPane.showInputDialog("Velocidad promedio (KM/H):");
        String distanciaStr = JOptionPane.showInputDialog("Distancia que hace falta (KM):");
        String tiempoDeseadoStr = JOptionPane.showInputDialog("¿En cuánto tienes que llegar? (minutos)");
        double velocidad = Double.parseDouble(velocidadStr);            // KM/H
        double distancia = Double.parseDouble(distanciaStr);            // KM
        double tiempoDeseado = Double.parseDouble(tiempoDeseadoStr);    // Minutos
        double tiempoReal = distancia / velocidad * 60;                 // H --> Minutos
        if(tiempoReal <= tiempoDeseado) {
            JOptionPane.showMessageDialog(null, "Sí llegas a tiempo", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No llegas a tiempo", "Resultado", JOptionPane.ERROR_MESSAGE);
        }
    }

    static void ejercicio1() {
        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
        String paterno = JOptionPane.showInputDialog("¿Cuál es tu apellido paterno?");
        String materno = JOptionPane.showInputDialog("¿Cuál es tu apellido materno?");

        //if(nombre == null) nombre = "";
        //else nombre = nombre.toUpperCase();
        nombre = nombre == null? "" : nombre.toUpperCase().trim();
        paterno = paterno == null? "" : paterno.toUpperCase().trim();
        materno = materno == null? "" : materno.toUpperCase().trim();

        System.out.printf("%s %s, %s\n", paterno, materno, nombre);
        //String nombreCompleto = paterno + " " + materno + ", " + nombre;
        String nombreCompleto = String.format("%s %s, %s\n", paterno, materno, nombre);
        JOptionPane.showMessageDialog(null, nombreCompleto);

    }
}

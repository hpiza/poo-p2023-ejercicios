import javax.swing.*;

public class Sesion4 {

    public static void main(String[] args) {
        int aPasar = 1 + (int) (24 * Math.random());
        System.out.println("A pasar: " + aPasar);  // 15, 5, 21, 17
        // diasPorMes();
        // capturarClave();
        capturarPrecioProducto();
    }

    static void capturarPrecioProducto() {
        double precio = 0;
        do {
            String preciostr = JOptionPane.showInputDialog("Ingrese el precio del producto");
            try{
                precio=Double.parseDouble(preciostr);
                if(precio <= 0) JOptionPane.showMessageDialog(null, "El precio debe ser positivo");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El precio debe ser un número real");
            }
        } while (precio <= 0);
    }

    static void capturarClave() {
        String clave = "hola123";
        String respuesta = null;
        int intentos = 0;
        do {
            respuesta = JOptionPane.showInputDialog(null,"Inserta la contraseña");
            if (respuesta == null) break;
            if (respuesta.equals("")) continue;
            intentos++;
            if (!respuesta.equals(clave)){
                JOptionPane.showMessageDialog(null,"Clave incorrecta");
            }
            else {
                JOptionPane.showMessageDialog(null,"Le atinaste en " + intentos + " intentos");
            }
        }while(!respuesta.equals(clave) );
    }

    static void diasPorMes() {
        int dias =0;
        String mes = JOptionPane.showInputDialog(null,"¿Cuál es el mes?").replace(" ", "");
        switch (mes.toLowerCase()) {
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            case "febrero":
                int año = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el año?"));
                if(año % 4 == 0 && año % 100 != 0 || año % 400 == 0)
                    dias = 29;
                else
                    dias = 28;


        }
        String mensaje = dias == 0? "El mes no existe": String.format("%s tiene %d días",mes ,dias);
        JOptionPane.showMessageDialog(null,mensaje);
    }
}

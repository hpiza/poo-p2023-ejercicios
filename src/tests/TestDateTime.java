package tests;

import com.iteso.calendar.Date;
import com.iteso.calendar.DateTime;

public class TestDateTime {

    public static void main(String[] args) {
//      Crea variable time1 que guarde la hora 11:59:59 PM y la fecha 31-Dic-2022
        DateTime time1 = new DateTime(31, 12, 2022,23, 59, 59);
//      Crea variable time2 que guarde la hora 12:00:00AM y la fecha 1-Ene-2023
        DateTime time2 = new DateTime(1, 1, 2023, 0, 0, 0);
//      Crea variable date3 que guarde la fecha 1-Ene-2023
        Date date3 = new Date(1, 1, 2023);
//      Crea una variable time4 que guarde la fecha date3 (utilizar 4to constructor)
        DateTime time4 = new DateTime(date3);
//      Crea una variable date5 que sea igual a la fecha de time1 (usar método toDate)
        Date date5 = time1.toDate();
//      Súmale un segundo a time1
        time1.next();
//      Imprima la comparación entre time1 y time2 en ambos sentidos
        System.out.println(time1.equals(time2));
        System.out.println(time2.equals(time1));
//      Imprima la comparación entre time2 y date3 en ambos sentidos
        System.out.println(time2.equals(date3));
        System.out.println(date3.equals(time2));
//      Almacenar todos los objetos creados en un mismo arreglo ¿de qué tipo será el arreglo?
        Date[] dates = { time1, time2, date3, time4, date5 };
//      Utilizando ciclo for-each, imprimir todos los objetos del arreglo en los 3 formatos (4 líneas de código)
        for(Date d: dates) {
            for(int f = 0; f <= 2; f ++) {
                d.setFormat(f);
                System.out.println(d);
            }
        }
    }

}

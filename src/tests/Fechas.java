package tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class Fechas {

    public static void main(String[] args) {
        // 1,677'684,303.527
        // 1,677'684,546.124
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        System.out.println(c1 == c2);
        System.out.println(c1);
        System.out.println(c2);
        c2.set(Calendar.MONTH, 21);
        System.out.println(c2);
        c2.set(Calendar.YEAR, 2030);
        System.out.println(c2);
        System.out.println(c2.get(Calendar.DATE));
        System.out.println(c2.get(Calendar.HOUR_OF_DAY));
        System.out.println(c2.getTimeInMillis());

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        System.out.println(date1.getDayOfYear() + ", " + date1.getMonth() + ", " + date1.getDayOfMonth());
        LocalDate date2 = LocalDate.of(1945, 2, 28);
        System.out.println(date2);
        System.out.println(date2.getDayOfWeek() + ", " + date2.getYear());
        System.out.println(date1.isAfter(date2));
        System.out.println(date2.isBefore(date1));

        LocalDate date3 = date1.plusWeeks(4);
        System.out.println(date3);
        System.out.println(date3.getDayOfYear() + ", " + date3.getDayOfWeek() + ", " + date3.getMonth() + ", " + date3.getDayOfMonth());

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        LocalTime time2 = LocalTime.of(9, 51, 48);
        System.out.println(time2);
        if(time1.equals(time2)) System.out.println("Suena alarma");

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);
        LocalDateTime dateTime2 = LocalDateTime.of(2021, 5, 16, 16, 45, 35, 345_000_000);
        System.out.println(dateTime2);
        LocalDateTime dateTime3 = LocalDateTime.of(2021, 5, 16, 16, 45, 35, 345_000_001);
        System.out.println(dateTime3);
        System.out.println(dateTime2.equals(dateTime3));
        System.out.println(LocalDateTime.now().equals(LocalDateTime.now()));
        // Instant, TimeZone
    }

}

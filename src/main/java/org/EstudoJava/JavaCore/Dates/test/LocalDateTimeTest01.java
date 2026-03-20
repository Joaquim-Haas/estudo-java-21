package org.EstudoJava.JavaCore.Dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        LocalDateTime Localdt = LocalDateTime.now();
        System.out.println(Localdt);
        System.out.println(Localdt.getHour());

        LocalDate date = LocalDate.parse("2022-08-06");
        //LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        LocalTime time = LocalTime.parse("09:46:49");
        //LocalTime time = LocalTime.of(13,55, 59);

        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        //LocalDateTime ldt1 = date.atTime(12,04,29);
        System.out.println(ldt1);

        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt2);
    }
}

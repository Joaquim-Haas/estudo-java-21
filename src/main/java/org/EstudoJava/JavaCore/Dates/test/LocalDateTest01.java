package org.EstudoJava.JavaCore.Dates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());

        LocalDate ld = LocalDate.of(2050, Month.MARCH, 20);

        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.lengthOfMonth());
        System.out.println(ld.isLeapYear());
        System.out.println(ld.get(ChronoField.YEAR)); //interface de Time
        System.out.println(ld.get(ChronoField.DAY_OF_MONTH)); //interface de Time
        System.out.println(ld);

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        agora.plusWeeks(4);
        System.out.println(agora); //LocalDate é imutável
        agora = agora.plusWeeks(4);
        System.out.println(agora); //mas se criar uma variavel de referência, dá certo
    }
}

package org.EstudoJava.JavaCore.Dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana. . .");
        }

        System.out.println("Dia do ano: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana do mês: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2); //2 dias do mês a mais
        c.add(Calendar.HOUR, 2);
        date = c.getTime();
        System.out.println(date);

        c.roll(Calendar.HOUR, 2);
        c.roll(Calendar.DAY_OF_MONTH, 2);
        date = c.getTime();
        System.out.println(date);
    }
}

package org.EstudoJava.JavaCore.Dates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        LocalTime LtTime = LocalTime.of(23, 32, 12);
        System.out.println(LtTime);

        LocalTime LtNow = LocalTime.now();
        System.out.println(LtNow);

        System.out.println(LtTime.getHour());
        System.out.println(LtTime.getMinute());
        System.out.println(LtTime.getSecond());
        System.out.println(LtTime.get(ChronoField.HOUR_OF_DAY));

        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}

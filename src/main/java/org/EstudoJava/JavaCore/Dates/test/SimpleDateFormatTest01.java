package org.EstudoJava.JavaCore.Dates.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String pattern = "'Brasil - Paraná, Ponta Grossa' dd 'de' MMMM 'de' yyyy";
        //String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat Sdf = new SimpleDateFormat(pattern);

        System.out.println(Sdf.format(new Date()));

        try{
            Sdf.parse("Brasil - Paraná, Ponta Grossa 20 de março de 2026");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}

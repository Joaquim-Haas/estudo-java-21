package org.EstudoJava.JavaCore.Formatação.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        Locale localeItaly = new Locale("it", "IT");
        Locale localeSweden = new Locale("se", "SE");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar cldr = Calendar.getInstance();

        DateFormat DfIta = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat DfSwe = DateFormat.getDateInstance(DateFormat.FULL, localeSweden);
        DateFormat DfInd = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat DfJap = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat DfHol = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia: " + DfIta.format(cldr.getTime()));
        System.out.println("Suecia: " + DfSwe.format(cldr.getTime()));
        System.out.println("India: " + DfInd.format(cldr.getTime()));
        System.out.println("Japao: " + DfJap.format(cldr.getTime()));
        System.out.println("Holanda: " + DfHol.format(cldr.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeItaly));
        System.out.println(localeSweden.getDisplayCountry(localeSweden));
        System.out.println(localeIndia.getDisplayCountry(localeIndia));
        System.out.println(localeJapao.getDisplayCountry(localeJapao));
        System.out.println(localeHolanda.getDisplayCountry(localeHolanda));
    }
}

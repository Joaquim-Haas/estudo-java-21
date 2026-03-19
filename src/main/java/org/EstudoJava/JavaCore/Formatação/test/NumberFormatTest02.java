package org.EstudoJava.JavaCore.Formatação.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        Locale localeDef = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeIt = Locale.ITALY;

        NumberFormat[] nfA = new NumberFormat[4];

        nfA[0] = NumberFormat.getCurrencyInstance();
        nfA[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfA[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfA[3] = NumberFormat.getCurrencyInstance(localeIt);

        double valor = 10_000.2130;

        for(NumberFormat numbForm : nfA){
            System.out.println(numbForm.getMaximumFractionDigits());
            System.out.println(numbForm.format(valor));
        }

        String valorString = "1.000.2130";

        try {
            nfA[1].parse(valorString);
        } catch (ParseException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}

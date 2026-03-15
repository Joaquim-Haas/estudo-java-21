package org.EstudoJava.JavaCore.Formatação.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {

        Locale localeDef = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeIt = Locale.ITALY;

        NumberFormat[] nfA = new NumberFormat[4];

        nfA[0] = NumberFormat.getInstance();
        nfA[1] = NumberFormat.getInstance(localeBR);
        nfA[2] = NumberFormat.getInstance(localeJP);
        nfA[3] = NumberFormat.getInstance(localeIt);

        double valor = 10_000.2130;

        for(NumberFormat numbForm : nfA){
            System.out.println(numbForm.format(valor));
        }
    }
}

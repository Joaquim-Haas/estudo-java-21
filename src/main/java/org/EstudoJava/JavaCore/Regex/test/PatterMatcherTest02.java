package org.EstudoJava.JavaCore.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {
        // meta-caracteres regex         String regex = "\\S";
        // \d = Todos os dígitos, numeros.
        // \D = Tudo que não for dígito.
        // \s = Espaços em branco.
        // \S = Espaços que não estão em branco.
        // \w = a-z; A-Z; 0-9; _.
        // \W = TUdo que não for incluso no \w.

        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "@#$hhj_45359834hhf ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto :  " + texto2);
        System.out.println("indice : 0123456789");
        System.out.println("regex : " + regex);
        System.out.println("Posicoes encontradas: ");
        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + " \n");
        }

    }
}

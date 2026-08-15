package org.EstudoJava.JavaCore.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest03 {
    public static void main(String[] args) {
        // Meta-caracteres regex         String regex = "\\S";
        // \d = Todos os dígitos, numeros.
        // \D = Tudo que não for dígito.
        // \s = Espaços em branco.
        // \S = Espaços que não estão em branco.
        // \w = a-z; A-Z; 0-9; _.
        // \W = TUdo que não for incluso no \w.

        // []

        // String regex = "[a-ZA-C]";
        //String regex = "[ABC]"

        String regex = "0[xX][0-9a-f]"; //[0-9] = \d
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto :  " + texto2);
        System.out.println("indice : 0123456789");
        System.out.println("regex : " + regex);
        System.out.println("Posicoes encontradas: ");
        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + " \n");
        }

        int numeroHex = 0x9; //numero decimal valido
        System.out.println(numeroHex);
    }
}

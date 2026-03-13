package org.EstudoJava.JavaCore.String.test;

public class StringTest02 {
    public static void main(String[] args) {

        String nome = "Lelouch";
        String numeros = "012345";

        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(1));
        System.out.println(nome.charAt(2));
        System.out.println(nome.charAt(3));
        System.out.println(nome.charAt(4));
        System.out.println(nome.charAt(5));
        System.out.println(nome.charAt(6));

        System.out.println("Tamano da String nome: " + nome.length());
        System.out.println(nome.replace("c","l"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(3));
        //System.out.println(numeros.substring(3,numeros.length())); a forma de cima é mais simples

        System.out.println(nome);
        System.out.println(nome.trim()); //corta espaços em branco
    }
}

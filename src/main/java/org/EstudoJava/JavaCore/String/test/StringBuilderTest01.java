package org.EstudoJava.JavaCore.String.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "Joaquim Haas";
        nome.concat(" querendo ser dev");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Joaquim Haas");
        //sb = nome; impossível, são tipos diferentes
        //sb.append() é o correto
        System.out.println(sb);
        sb.append(" querendo ser dev ");
        System.out.println(sb);
        sb.append("testando 1 ").append("testando 2");
        System.out.println(sb);

        //String substring = sb.substring(0,2);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.delete(0,3);
        System.out.println(sb);
    }
}

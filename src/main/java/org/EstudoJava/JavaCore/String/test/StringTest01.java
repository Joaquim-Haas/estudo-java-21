package org.EstudoJava.JavaCore.String.test;

public class StringTest01 {
    public static void main(String[] args) {
        //String sao imutaveis
        String nome = "Joaquim"; //String constant pool
        String nome2 = "Joaquim";

        System.out.println(nome);
        nome = nome.concat(" Haas"); //nome += " Haas"
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Joaquim"); // 1 - variavel de referencia
                                                     // 2 - objeto tipo string
                                                     // 3 - string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
        // xxxx == yyyy, o == é usado para comparar referências
    }
}

package org.EstudoJava.JavaCore.Associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        //scan.nextLine(); pega a linha inteira
        //scan.next(); pega somente a primeira palavra

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo: ");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite H ou M para seu sexo: ");
        char sexo = scan.next().charAt(0); //primeira posição da palavra em uma String

        System.out.println("=-=-=-=-=-=-=-=");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " +  sexo);

        scan.close();

    }
}

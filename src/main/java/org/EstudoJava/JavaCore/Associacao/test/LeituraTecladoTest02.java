package org.EstudoJava.JavaCore.Associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua pergunta, irá responder sim ou não de acordo com a sua pergunta: ");
        String pergunta = scan.nextLine();

        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }
        else{
            System.out.println("NAO");
        }

        scan.close();
    }
}

package org.EstudoJava.JavaCore.Metodos.test;

import org.EstudoJava.JavaCore.Metodos.domain.Calculadora;
import java.util.Scanner;

public class CalculadoraTeste01 {
    public static void main(String[] args) {

        Calculadora calculo = new Calculadora();
        Scanner scan = new Scanner(System.in);
        int escolha, num1, num2;

        do {
            System.out.println("Calculadora, o que deseja fazer? ");
            System.out.println("1 - Somar\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Multiplica 1kk\n6 - Sair\n");
            escolha = scan.nextInt();
            switch (escolha){
                case 1: //void
                    System.out.println("Digite um numero: ");
                    num1 = scan.nextInt();
                    System.out.println("Digite um outro numero: ");
                    num2 = scan.nextInt();
                    calculo.somaNumeros(num1, num2);

                    break;

                case 2: //void
                    System.out.println("Digite um numero: ");
                    num1 = scan.nextInt();
                    System.out.println("Digite um outro numero: ");
                    num2 = scan.nextInt();
                    calculo.subtraiNumeros(num1, num2);
                    break;

                case 3: //void
                    System.out.println("Digite um numero: ");
                    num1 = scan.nextInt();
                    System.out.println("Digite um outro numero: ");
                    num2 = scan.nextInt();
                    calculo.multiplicaNumeros(num1, num2);
                    break;

                case 4: //void
                    System.out.println("Digite um numero: ");
                    num1 = scan.nextInt();
                    System.out.println("Digite um outro numero: ");
                    num2 = scan.nextInt();
                    calculo.divideNumeros(num1, num2);
                    break;

                case 5: //retorno
                    System.out.println("Digite um numero: ");
                    num1 = scan.nextInt();
                    int resultado = calculo.multiplicaMilhao(num1);
                    System.out.println(resultado);
                    break;

                case 6:
                    System.out.println("Finalizando calculadora...\n");
                    break;

                default:
                    System.out.println("Escolha incorreta, tente novamente.\n");
            }
        } while (escolha != 6);
    }
}

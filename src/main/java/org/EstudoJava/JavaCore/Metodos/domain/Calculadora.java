package org.EstudoJava.JavaCore.Metodos.domain;

public class Calculadora {

    public void somaNumeros(int num1, int num2){
        System.out.println(num1 + num2 + "\n");
    }

    public void subtraiNumeros(int num1, int num2){
        System.out.println(num1 - num2 + "\n");
    }

    public void multiplicaNumeros(int num1, int num2){
        System.out.println(num1 * num2 + "\n");
    }

    public void divideNumeros(int num1, int num2){
        if(num1 < num2){
            System.out.println("Impossivel dividir " + num1 + " por " + num2);
            return;
        }
        else{
            System.out.println(num1 / num2 + "\n");
        }
    }

    public int multiplicaMilhao(int num1){
        if(num1 == 0){
            System.out.println("Numero é 0, logo o resultado dará 0.");
            return 0;
        }
        else {
            return num1 * 100000;
        }
    }

    public void somaArray(int[] numeros){
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);

    }

    public void somaVarArgs(int... numeros){
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}

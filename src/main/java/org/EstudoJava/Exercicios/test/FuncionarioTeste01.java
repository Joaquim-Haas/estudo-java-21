package org.EstudoJava.Exercicios.test;

import org.EstudoJava.Exercicios.domain.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Cleiton";
        funcionario01.idade = 32;
        funcionario01.salario = new double[]{1000, 980, 985};

        funcionario01.imprimeTudo(funcionario01);
        funcionario01.imprimirNome(funcionario01);
        funcionario01.imprimirMediaSalarial(funcionario01);
        funcionario01.imprimirIdade(funcionario01);

        //pode-se fazer menu com switch case;
    }
}

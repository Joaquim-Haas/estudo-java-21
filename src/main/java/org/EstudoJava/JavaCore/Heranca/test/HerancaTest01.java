package org.EstudoJava.JavaCore.Heranca.test;

import org.EstudoJava.JavaCore.Heranca.domain.Endereco;
import org.EstudoJava.JavaCore.Heranca.domain.Funcionario;
import org.EstudoJava.JavaCore.Heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("848483-910");

        Pessoa pessoa = new Pessoa("Ichigo Kurosaki");
        pessoa.setCpf("455.456.994-90");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        //herança de pessoa > funcionario abaixo

        Endereco endereco1 = new Endereco(); //usar depois
        endereco1.setRua("Rua Mabashi Street");
        endereco1.setCep("856755-478");

        Funcionario funcionario = new Funcionario("Makise Kurisu");
        funcionario.setCpf("055.574.376-49");
        funcionario.setEndereco(endereco1);
        funcionario.setSalario(15500.00);

        funcionario.imprime();
    }
}

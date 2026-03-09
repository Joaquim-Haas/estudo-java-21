package org.EstudoJava.JavaCore.Exception.exception.test;

import org.EstudoJava.JavaCore.Exception.exception.domain.Funcionario;
import org.EstudoJava.JavaCore.Exception.exception.domain.LoginInvalidoException;
import org.EstudoJava.JavaCore.Exception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

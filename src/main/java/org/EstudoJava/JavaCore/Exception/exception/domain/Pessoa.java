package org.EstudoJava.JavaCore.Exception.exception.domain;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa. . .");
    }
}

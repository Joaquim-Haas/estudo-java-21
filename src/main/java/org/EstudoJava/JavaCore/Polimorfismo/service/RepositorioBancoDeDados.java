package org.EstudoJava.JavaCore.Polimorfismo.service;

import org.EstudoJava.JavaCore.Polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando em um banco de dados. . .");
    }

}

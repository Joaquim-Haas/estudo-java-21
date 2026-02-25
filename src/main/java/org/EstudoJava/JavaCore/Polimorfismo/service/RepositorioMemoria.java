package org.EstudoJava.JavaCore.Polimorfismo.service;

import org.EstudoJava.JavaCore.Polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando na memoria. . .");
    }
}

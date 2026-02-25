package org.EstudoJava.JavaCore.Polimorfismo.test;

import org.EstudoJava.JavaCore.Polimorfismo.repositorio.Repositorio;
import org.EstudoJava.JavaCore.Polimorfismo.service.RepositorioArquivo;
import org.EstudoJava.JavaCore.Polimorfismo.service.RepositorioBancoDeDados;
import org.EstudoJava.JavaCore.Polimorfismo.service.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {

        RepositorioBancoDeDados repositorioBancoDeDados1 = new RepositorioBancoDeDados();
        repositorioBancoDeDados1.salvar();

        Repositorio repositorio1 = new RepositorioBancoDeDados();
        repositorio1.salvar();

        Repositorio repositorio2 = new RepositorioArquivo();
        repositorio2.salvar();

        Repositorio repositorio3 = new RepositorioMemoria();
        repositorio3.salvar();

    }
}

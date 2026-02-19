package org.EstudoJava.JavaCore.Heranca.test;

import org.EstudoJava.JavaCore.Heranca.domain.Funcionario;

public class HerancaTest02 {
    //0 - Bloco de inicializacao estatico da super classe é executado quando JVM carregar classe
    //1 - Bloco de inicializacao estatico da subclasse é executado quando JVM carregar classe
    //2 - Alocado espaco em memoria pro objeto da super classe
    //3 - cada artributo de classe e criado e inicializado com valores default ou o que for passado
    //4 - Bloco de inicializacao superclasse e executado
    //5 - Construtor da super classe é executado
    //6 - Alocado espaco em memoria da subclasse
    //7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
    //8 - Bloco de inicializacao subclasse e executado na ordem em que aparece
    //9 - Construtor da subclasse é executado

    public static void main(String[] args) {
        //blocos de inicializacao entre herança
        Funcionario funca = new Funcionario("Josefo");
    }
}

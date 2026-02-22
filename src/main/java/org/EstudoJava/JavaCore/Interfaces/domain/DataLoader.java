package org.EstudoJava.JavaCore.Interfaces.domain;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;
    //todos os atributos em uma interface são constantes

    public abstract void load();

    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões. . .");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da retrieveMaxDataSize na interface DataLoader: " + MAX_DATA_SIZE);
    }
}

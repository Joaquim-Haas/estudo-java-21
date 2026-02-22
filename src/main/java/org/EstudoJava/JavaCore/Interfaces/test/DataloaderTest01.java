package org.EstudoJava.JavaCore.Interfaces.test;

import org.EstudoJava.JavaCore.Interfaces.domain.DataLoader;
import org.EstudoJava.JavaCore.Interfaces.domain.DatabaseLoader;
import org.EstudoJava.JavaCore.Interfaces.domain.FileLoader;

import javax.xml.crypto.Data;

public class DataloaderTest01 {
    public static void main(String[] args) {

        //DataLoader data = new DataLoader();

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}

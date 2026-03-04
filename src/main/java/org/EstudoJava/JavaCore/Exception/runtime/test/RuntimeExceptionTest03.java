package org.EstudoJava.JavaCore.Exception.runtime.test;

import java.io.File;
import java.io.IOException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo/test.txt");

        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }
        catch (IOException e){
            e.printStackTrace();
            throw e;
            //throw new RuntimeException("Problema na hora de criar o arquivo.");
        }
    }
}

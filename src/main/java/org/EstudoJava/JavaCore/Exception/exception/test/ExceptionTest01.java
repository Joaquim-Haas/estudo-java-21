package org.EstudoJava.JavaCore.Exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){

        File file = new File("arquivo/test.txt");

        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }
        catch (IOException e){ //sempre tentar capturar as excessões mais específicas
            //nunca deixar o catch em branco, pois ignora completamente a excessão
            e.printStackTrace(); //colocar o printStackTrace não é mais uma boa prática a nivel de segurança, pois ele imprime dados interno da aplicação
        }
    }
}

package org.EstudoJava.JavaCore.Exception.exception.test;

import org.EstudoJava.JavaCore.Exception.exception.domain.Leitor1;
import org.EstudoJava.JavaCore.Exception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

        lerArquivo();
    }

    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo2(){
        Reader reader = null;

        try{
            reader = new BufferedReader(new FileReader("test.txt"));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        finally {
            try{
                if(reader != null){
                    reader.close();
                }
            }
            catch (IOException exc){
                exc.printStackTrace();
            }
        }
    }
}

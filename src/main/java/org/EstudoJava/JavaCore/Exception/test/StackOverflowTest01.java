package org.EstudoJava.JavaCore.Exception.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        //Stackoverflow Error
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}

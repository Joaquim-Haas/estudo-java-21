package org.EstudoJava.JavaCore.Exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
//        System.out.println(divisao(1,0));
        try{
            divisao(1,0);
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("código finalizado");
    }

    private static int divisao(int a, int b) /*throws IllegalArgumentException */{

        if(b == 0){
          //throw new RuntimeException("Argumento ilegal, não pode ser dividido por 0");
            throw new IllegalArgumentException("Argumento ilegal, não pode ser dividido por 0");
        }
        return a/b;

//        try{
//            return a/b;
//        }
//        catch (RuntimeException e){
//            e.printStackTrace();
//        }
//        return 0;
    }
}

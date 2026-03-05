package org.EstudoJava.JavaCore.Exception.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        System.out.println(abreConexao());
        System.out.println("-----------");
        abreConexao2();
    }

    public static String abreConexao(){
        try{
            System.out.println("abrindo arquivo");
            System.out.println("Escrevendo dados no arquivoo");
            return "conexão aberta";
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    public static void abreConexao2(){
        try{
            System.out.println("abrindo arquivo");
            System.out.println("Escrevendo dados no arquivoo");
            throw new RuntimeException();
        }
        finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}

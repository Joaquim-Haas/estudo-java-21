package org.EstudoJava.JavaCore.Exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
    public static void main(String[] args) {

        try{
            //throw new IndexOutOfBoundsException();
            //throw new ArrayIndexOutOfBoundsException();
            //throw new ArithmeticException();
            throw new RuntimeException();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }
        catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }
        catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }
        catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException"); //a mais generica tem que ser a última para não tomar lugar dass outras exceptions
        }

        try{
            talvezLanceException(); //da pra usar IOException para pegar as duas exceptions;
            //Exception > IOException > SQLException, FileNotFoundException
        }
        catch (SQLException e){

        }
        catch (FileNotFoundException e){

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}

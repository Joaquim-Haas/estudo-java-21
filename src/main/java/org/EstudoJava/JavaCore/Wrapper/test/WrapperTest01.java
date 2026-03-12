package org.EstudoJava.JavaCore.Wrapper.test;


public class WrapperTest01 {
    public static void main(String[] args){

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L; // autoboxing, conversão automatica de primitivo para wrapper
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing, conversão automatica de wrapper para primitivo
        Integer intW2 = Integer.parseInt("1");
        //Integer intW3 = new Integer("2"); versão depreciada

        //Byte.parseByte()
        //.parseDouble()

        //new Boolean("true"); versão depreciada
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        boolean verdadeiro2 = Boolean.parseBoolean("tRuE"); //ignorecase
        System.out.println(verdadeiro2);

        boolean verdadeiro3 = Boolean.parseBoolean("sas");
        System.out.println(verdadeiro3);

        boolean verdadeiro4 = Boolean.parseBoolean(null);
        System.out.println(verdadeiro4);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('!'));

    }
}

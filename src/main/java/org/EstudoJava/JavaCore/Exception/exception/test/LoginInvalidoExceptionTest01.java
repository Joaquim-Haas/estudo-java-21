package org.EstudoJava.JavaCore.Exception.exception.test;

import org.EstudoJava.JavaCore.Exception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner scan = new Scanner(System.in);

        String usernameDB = "Goku";
        String senhaDB = "supersaiyajin";

        System.out.println("Digite o usuario: ");
        String userDigitado = scan.nextLine();
        System.out.println("Digite a senha: ");
        String senhaDigitada = scan.nextLine();

        if(!userDigitado.equals(usernameDB) || !senhaDigitada.equals(senhaDB)){
            throw new LoginInvalidoException("Usuario ou senha invalidos...");
        }

        System.out.println("Usuario logado com sucesso");
    }
}

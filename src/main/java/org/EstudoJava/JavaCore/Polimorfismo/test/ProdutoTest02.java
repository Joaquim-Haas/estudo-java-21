package org.EstudoJava.JavaCore.Polimorfismo.test;

import org.EstudoJava.JavaCore.Polimorfismo.domain.Computador;
import org.EstudoJava.JavaCore.Polimorfismo.domain.Produto;
import org.EstudoJava.JavaCore.Polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Positivo R15", 2800);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        
        Produto produto1 = new Tomate("Tomate Caqui", 2);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
    }
}

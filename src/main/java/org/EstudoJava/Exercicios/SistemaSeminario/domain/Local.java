package org.EstudoJava.Exercicios.SistemaSeminario.domain;

public class Local {
    private String endereco;

    public Local(String Endereco){
        this.endereco = Endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

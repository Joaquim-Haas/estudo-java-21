package org.EstudoJava.Exercicios.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario = new double[3];

    public void imprimirNome(Funcionario funcionario){
        System.out.println("Nome do funcionario: " + this.nome);
    }

    public void imprimirIdade(Funcionario funcionario){
        System.out.println("Idade do funcionario: " + this.idade);
    }

    public void imprimirSalario(Funcionario funcionario){
        System.out.println("Ultimos 3 salarios do funcionario: ");

        for(int i = 0; i < 3; i++){
            System.out.println("Salario " + (i+1) + " R$" + this.salario[i]);
        }
    }

    public void imprimeTudo(Funcionario funcionario){
        System.out.println("Todas as informações do funcionário abaixo: ");
        imprimirNome(funcionario);
        imprimirIdade(funcionario);
        imprimirSalario(funcionario);
        imprimirMediaSalarial(funcionario);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
    }

    public void imprimirMediaSalarial(Funcionario funcionario){
        double somaSalario = 0;

        if(funcionario.salario == null){
            System.out.println("Salario Nulo!");
            return;
        }

        for (int i = 0; i < funcionario.salario.length; i++){
            somaSalario += funcionario.salario[i];
        }

        double media = somaSalario / funcionario.salario.length;
        System.out.printf("A media salarial do funcionario " + funcionario.nome + " é de R$%.2f\n", media);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

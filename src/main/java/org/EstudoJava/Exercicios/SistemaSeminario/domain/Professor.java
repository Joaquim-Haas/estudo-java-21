package org.EstudoJava.Exercicios.SistemaSeminario.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String Nome, String Especialidade, Seminario[] Seminarios){
        this.nome = Nome;
        this.especialidade = Especialidade;
        this.seminarios = Seminarios;
    }

    public Professor(String Nome, String Especialidade){
        this.nome = Nome;
        this.especialidade = Especialidade;
    }

    public void imprime(){
        System.out.println("=-=-=-=-=-=");
        System.out.println("Professor: " + this.nome);
        System.out.println("=-=-=-=-=-=");

        if (this.seminarios == null){
            return;
        }

        System.out.println("Seminarios cadastrados: ");

        for(Seminario seminario : this.seminarios){
            System.out.println(seminario.getNome());
            System.out.println(seminario.getLocal().getEndereco());

            if (seminario.getEstudantes() == null || seminario.getEstudantes().length == 0){
                continue;
            }

            System.out.println("=-=-=-=-=-=");
            System.out.println("Alunos: ");

            for(Estudante estudante : seminario.getEstudantes()){
                System.out.println("Nome: " + estudante.getNome());
                System.out.println("Idade: " + estudante.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome){
        this.nome = Nome;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String Especialidade){
        this.especialidade = Especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] Seminarios) {
        this.seminarios = Seminarios;
    }
}

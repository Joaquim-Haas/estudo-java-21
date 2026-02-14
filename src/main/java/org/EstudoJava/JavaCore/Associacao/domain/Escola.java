package org.EstudoJava.JavaCore.Associacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println(this.nome);
        if(professores == null){
            return;
        }
        for (Professor professor : professores){
            System.out.println(professor.getNome());
        }
    }

    public Escola(String Nome){
        this.nome = Nome;
    }

    public Escola(String Nome, Professor[] Professores){
        this.nome = Nome;
        this.professores = Professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] Professores) {
        this.professores = Professores;
    }
}

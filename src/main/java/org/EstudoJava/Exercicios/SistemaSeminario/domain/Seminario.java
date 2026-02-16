package org.EstudoJava.Exercicios.SistemaSeminario.domain;

public class Seminario {
    private String nome;
    private Local local;
    private Professor[] professores;
    private Estudante[] estudantes;

//    public Seminario(String Nome, Local Local, Professor[] Professores) {
//        this.nome = Nome;
//        this.local = Local;
//        this.professores = Professores;
//    }

    public Seminario(String Nome, Local Local){
        this.nome = Nome;
        this.local = Local;
    }

    public Seminario(String Nome, Local Local, Professor[] Professores, Estudante[] Estudantes) {
        this.nome = Nome;
        this.local = Local;
        this.professores = Professores;
        this.estudantes = Estudantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local Local) {
        this.local = Local;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] Professores) {
        this.professores = Professores;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] Estudantes) {
        this.estudantes = Estudantes;
    }
}

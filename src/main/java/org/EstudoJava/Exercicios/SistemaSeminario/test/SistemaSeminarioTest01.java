package org.EstudoJava.Exercicios.SistemaSeminario.test;

import org.EstudoJava.Exercicios.SistemaSeminario.domain.Estudante;
import org.EstudoJava.Exercicios.SistemaSeminario.domain.Local;
import org.EstudoJava.Exercicios.SistemaSeminario.domain.Professor;
import org.EstudoJava.Exercicios.SistemaSeminario.domain.Seminario;

public class SistemaSeminarioTest01 {
    public static void main(String[] args) {

        Local local = new Local("Ilha dos homens peixes");
        Estudante estudante1 = new Estudante("Luffy", 19);
        Professor professor1 = new Professor("Rayleigh", "Haki");
        Estudante[] alunosSeminario = {estudante1};
        Professor[] professores = {professor1};
        Seminario seminario = new Seminario("Seminario do Haki avançado", local, professores, alunosSeminario);
        Seminario[] seminarios = {seminario};

        professor1.setSeminarios(seminarios);
        //foi feito a impressão dentro da classe professor, mas poderia ser feito em Services
        professor1.imprime();
    }
}

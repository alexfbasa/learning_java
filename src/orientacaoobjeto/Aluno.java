package orientacaoobjeto;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    String nome;

    List<Curso> cursos = new ArrayList<>();


    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public String toString() {
        return nome;
    }

    Curso obterCurso(String nome) {
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

}

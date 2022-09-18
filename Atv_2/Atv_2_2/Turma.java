package Atv_2_2;
import java.util.ArrayList;

public class Turma {
    private String Nome;
    private int NumMatriculados;
    private ArrayList<Matricula> Matriculas;
    private boolean CursoIniciado;

    Turma(String Nome)  {
        this.Nome = Nome;
        NumMatriculados = 0;
        Matriculas = new ArrayList<Matricula>();
        CursoIniciado = false;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getNome() {
        return Nome;
    }

    public int getNumMatriculados() {
        return NumMatriculados;
    }

    public void IniciaCurso() {
        CursoIniciado = true;
    }
    public boolean getCursoIniciado() {
        return CursoIniciado;
    }

    public void NomeAlunoMatricula(int indexMatricula) {
        System.out.println(Matriculas.get(indexMatricula).getNomeAluno());
    }

    public void fazMatriculaTurma(Matricula matricula) {
        Matriculas.add(NumMatriculados, matricula);
        NumMatriculados++;
    }
}

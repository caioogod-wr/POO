package Atv_2_2;
import java.util.ArrayList;

public class Curso {
    private String Nome;
    private int TempoMinimo;
    private ArrayList<Turma> Turmas;
    private int NumTurmas;

    Curso(String Nome, int TempoMinimo) {
        this.Nome = Nome;
        this.TempoMinimo = TempoMinimo;
        Turmas = new ArrayList<>();
        NumTurmas = 0;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getNome() {
        return Nome;
    }

    public int getTempoMinimo() {
        return TempoMinimo;
    }

    public void RecebeTurma(Turma turma) {
        if(turma.getNumMatriculados() >= 10) {
            turma.IniciaCurso();
            Turmas.add(NumTurmas, turma);
            NumTurmas++;
        }
        else {
            System.out.println("Numero de turmas insuficiente");
        }
    }

    public void InformacoesTurma(int indiceTurma) {
        System.out.println("Nome da Turma: " + Turmas.get(indiceTurma).getNome() + "\nCurso Iniciado: " + Turmas.get(indiceTurma).getCursoIniciado() + 
        "\nNumero de MAtriculados: " + Turmas.get(indiceTurma).getNumMatriculados() + "\n");

        System.out.println("Matriculados: ");
        for(int i = 0; i < Turmas.get(indiceTurma).getNumMatriculados(); i++) {
            Turmas.get(indiceTurma).NomeAlunoMatricula(i);
        }
    }
}

package Atv_2_2;
import java.util.ArrayList;

public class Aluno {
    private String Nome;
    private int Idade;
    private String NroUSP;
    private ArrayList<Matricula> Matriculas;
    private int NumMatriculas;
    
    Aluno(String Nome, int Idade, String NroUSP) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.NroUSP = NroUSP;
        Matriculas = new ArrayList<Matricula>();
        NumMatriculas = 0;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getNome() {
        return Nome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    public int getIdade() {
        return Idade;
    }

    public void setNroUSP(String NroUSP) {
        this.NroUSP = NroUSP;
    }
    public String getNroUSP() {
        return NroUSP;
    }

    public void fazMatriculaAluno(Turma turma) {
        Matricula Nova_matricula = new Matricula(turma.getNome(), Nome);
        turma.fazMatriculaTurma(Nova_matricula);
        Matriculas.add(NumMatriculas, Nova_matricula);
        NumMatriculas++;
    }
}

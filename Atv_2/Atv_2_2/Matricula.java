package Atv_2_2;

public class Matricula {
    private String NomeTurma;
    private String NomeAluno;

    Matricula(String NomeTurma, String NomeAluno) {
        this.NomeTurma = NomeTurma;
        this.NomeAluno = NomeAluno;
    }

    public void setNomeTurma(String NomeTurma) {
        this.NomeTurma = NomeTurma;
    }
    public String getNomeTurma() {
        return NomeTurma;
    }

    public void setNomeAluno(String NomeAluno) {
        this.NomeAluno = NomeAluno;
    } 
    public String getNomeAluno() {
        return NomeAluno;
    }
}

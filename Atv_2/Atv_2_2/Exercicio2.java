package Atv_2_2;

public class Exercicio2 {
    public static void main(String argv[]) {
        Curso curso = new Curso("Engenharia de Computacao", 5);
        Turma turma = new Turma("021");
        Aluno aluno1 = new Aluno("Caio", 19 , "12731996");
        Aluno aluno2 = new Aluno("Hugo", 19 , "12731995");
        Aluno aluno3 = new Aluno("Chiarotto", 19 , "12731994");
        Aluno aluno4 = new Aluno("Narrador", 19 , "12731993");
        Aluno aluno5 = new Aluno("Daniel", 19 , "12731992");
        Aluno aluno6 = new Aluno("Arthur", 19 , "12731991");
        Aluno aluno7 = new Aluno("Felipe", 19 , "12731990");
        Aluno aluno8 = new Aluno("Olin", 19 , "12731989");
        Aluno aluno9 = new Aluno("Isaac", 19 , "12731987");
        Aluno aluno10 = new Aluno("Icaro", 19 , "12731988");

        aluno1.fazMatriculaAluno(turma);
        aluno2.fazMatriculaAluno(turma);
        aluno3.fazMatriculaAluno(turma);
        aluno4.fazMatriculaAluno(turma);
        aluno5.fazMatriculaAluno(turma);
        aluno6.fazMatriculaAluno(turma);
        aluno7.fazMatriculaAluno(turma);
        aluno8.fazMatriculaAluno(turma);
        aluno9.fazMatriculaAluno(turma);
        aluno10.fazMatriculaAluno(turma);

        curso.RecebeTurma(turma);

        curso.InformacoesTurma(0);
    }
}
package main.java.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    private Set<Aluno> cadastroAluno;

    public GerenciadorAlunos(){
        this.cadastroAluno = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        cadastroAluno.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemove = null;
        for(Aluno a: cadastroAluno){
            if(a.getMatricula() == matricula){
                alunoParaRemove = a;
                break;
            }
        }
        cadastroAluno.remove(alunoParaRemove);
    }

    public void exibirAlunosPorNome(String nome){
        Set<Aluno> alunoNome = new TreeSet<>(cadastroAluno);
            if(!cadastroAluno.isEmpty()){
                System.out.println(alunoNome);
            }
        }
    
    public void exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorNota());
        alunoPorNota.addAll(cadastroAluno);
        System.out.println(alunoPorNota);

    }

    public void exibirAlunos(){
        System.out.println(cadastroAluno);
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Pedro", 123456L, 8);
        alunos.adicionarAluno("Paulo", 223456L, 7.5);
        alunos.adicionarAluno("Carlos", 133456L, 9);
        alunos.adicionarAluno("José", 124456L, 10);
        alunos.adicionarAluno("João", 123556L, 5);

        System.out.println();
        System.out.println(alunos.cadastroAluno);
        System.out.println();
        alunos.removerAluno(123456l);
        alunos.exibirAlunos();
        alunos.exibirAlunosPorNota();
        alunos.exibirAlunosPorNome("José");




    }


}

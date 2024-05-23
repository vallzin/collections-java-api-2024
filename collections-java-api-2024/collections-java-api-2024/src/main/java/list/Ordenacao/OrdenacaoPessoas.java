package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.58);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 27, 1.60);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 18, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 45, 1.45);
        ordenacaoPessoas.adicionarPessoa("Nome 5", 14, 2.00);

        //System.out.println(ordenacaoPessoas.ordenadoPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}

package main.java.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // atributo
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorProPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 2d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 30d, 25);
        cadastroProdutos.adicionarProduto(3L, "Produto 25", 15d, 35);
        cadastroProdutos.adicionarProduto(4L, "Produto 15", 2d, 15);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println();
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println();
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }

}

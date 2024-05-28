package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    //atributo
    public Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome, quantidade ,preco ));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p : estoqueProdutoMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        System.out.println();
        estoque.exibirProdutos();

        estoque.adicionarProduto(123L, "caderno", 10, 10.0);
        estoque.adicionarProduto(145L, "borracha", 100, 3.5);
        estoque.adicionarProduto(155L, "lápis", 50, 5.0);
        estoque.adicionarProduto(489L, "ResmaPapel", 20, 20.0);

        System.out.println();
        estoque.exibirProdutos();
        System.out.println();
        System.out.println("O valor total do estoque é " + estoque.calcularValorTotalEstoque());
        System.out.println();
        System.out.println("O produto mais caro em estoque é " + estoque.obterProdutoMaisCaro());
    }
}

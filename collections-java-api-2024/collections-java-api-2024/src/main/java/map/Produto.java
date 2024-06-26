package main.java.map;

public class Produto {
    //atributos
    private final String nome;
    private final int quantidade;
    private final Double preco;

    public Produto(String nome, Integer quantidade, Double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return " Produto [ nome = " + nome + ", quantidade = " + quantidade + ", preco = " + preco + "]\n";
    }
}

package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //métodos
    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.carrinhoList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if(!carrinhoList.isEmpty()){
            for(Item i : carrinhoList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
        carrinhoList.removeAll(itemParaRemover);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!carrinhoList.isEmpty()){
            for(Item item : carrinhoList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
            }
            else{
                throw new RuntimeException("A lista está vaziz");
            }
        }

        public void exibirItens(){
            if(!carrinhoList.isEmpty()){
                System.out.println(this.carrinhoList);
            }else{
                System.out.println("A lista está vaziz");
            }
        }

        @Override
        public String toString() {
            return "CarrinhoDeCompras [carrinhoList=" + carrinhoList + "]";
        }

        public static void main(String[] args) {
            //instanciando carrinho de compra
            CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

            carrinhoDeCompras.adicionarItem("Caderno", 10.00, 2);
            carrinhoDeCompras.adicionarItem("Caneta", 5.50, 5);
            carrinhoDeCompras.adicionarItem("Marca texto", 8.90, 3);
            carrinhoDeCompras.adicionarItem("Fita adesiva", 3.00, 1);

            //exibindo itens
            carrinhoDeCompras.exibirItens();

            //remover item
            carrinhoDeCompras.removerItem("Fita adesiva");

            carrinhoDeCompras.exibirItens();

            //valor total
            System.out.println("O valor total foi de: "+carrinhoDeCompras.calcularValorTotal());
        }

    }

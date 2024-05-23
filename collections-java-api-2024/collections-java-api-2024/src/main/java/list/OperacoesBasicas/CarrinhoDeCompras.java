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
        for(Item i : carrinhoList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        carrinhoList.removeAll(itemParaRemover);
    }
    

    
}

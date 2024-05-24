package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    //atributos
    private List<Integer> numeroList;

    public OrdenacaoNumeros(){
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumero(){
        if(!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(48);
        numeros.adicionarNumero(23);

        //ordenar numeros
        System.out.println();
        numeros.exibirNumero();
        System.out.println();
        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());

    }
}

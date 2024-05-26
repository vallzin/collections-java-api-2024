package main.java.set;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoPalavrasUnicas {
    //atributos
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas(){
        this.palavraSet = new TreeSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavraSet.isEmpty()){
            if(palavraSet.contains(palavra)){
                palavraSet.remove(palavra);
            }else{
                System.out.println("Palavre não encontrada");
            }
        }else{
            throw new RuntimeException("Set vazio");
        }
    }
    
    public boolean verificarPalavra(String palavra){
        return palavraSet.contains(palavra);
    }
    
    public void exibirPalavrasUnicas(){
        if(!palavraSet.isEmpty()){
            System.out.println(palavraSet);
        }else{
            throw new RuntimeException("Set vazio");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Miguel");
        conjuntoPalavrasUnicas.adicionarPalavra("João");
        conjuntoPalavrasUnicas.adicionarPalavra("Carlos");
        conjuntoPalavrasUnicas.adicionarPalavra("José");
        conjuntoPalavrasUnicas.adicionarPalavra("Maria");
        conjuntoPalavrasUnicas.adicionarPalavra("Miguel");

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Maria"));
        
        conjuntoPalavrasUnicas.removerPalavra("Valmilson");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}



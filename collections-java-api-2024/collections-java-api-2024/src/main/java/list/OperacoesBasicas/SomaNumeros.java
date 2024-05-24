package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer numero : numeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for(Integer numero: numeros){
                if(numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista está vaziz");
        }
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "SomaNumeros [numeros=" + numeros + "]";
    }

    public static void main(String[] args) {
        //instaciando somar numeros
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(27);
        somaNumeros.adicionarNumero(50);

        
        System.out.println();
        //somando números
        System.out.println(somaNumeros.calcularSoma());
        //maior número
        System.out.println(somaNumeros.encontrarMaiorNumero());
        //menor número
        System.out.println(somaNumeros.encontrarMenorNumero());
        //exibindo numero
        System.out.println();
        somaNumeros.exibirNumeros();
    }
}

package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado(){
        this.convidadoSet = new HashSet<>();
    }
    
    public void adicionarConvidado(String name, int codigoConvidado){
        convidadoSet.add(new Convidado(name, codigoConvidado));
    }

    public void removerConvidadoPorConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem "+conjuntoConvidado.contarConvidados() + " convidados dentro do Set de convidados");
        System.out.println();

        conjuntoConvidado.adicionarConvidado("Convidado 1", 12345);
        conjuntoConvidado.adicionarConvidado("Convidado 1", 12333);
        conjuntoConvidado.adicionarConvidado("Convidado 1", 12333);
        conjuntoConvidado.adicionarConvidado("Convidado 1", 12355);

        System.out.println();
        System.out.println("Existem "+conjuntoConvidado.contarConvidados()+ " convidados dentro do Set de convidados");

        conjuntoConvidado.removerConvidadoPorConvite(12333);
        System.out.println();
        conjuntoConvidado.exibirConvidados();
    }
}

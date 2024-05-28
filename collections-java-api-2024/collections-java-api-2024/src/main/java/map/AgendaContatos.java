package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args){
        AgendaContatos contato = new AgendaContatos();

        contato.adicionarContato("Maria", 123456789);
        contato.adicionarContato("Marta Medeiros", 123456755);
        contato.adicionarContato("Paula Maria", 123456722);
        contato.adicionarContato("Maria Paula", 123456711);

        System.out.println();
        contato.exibirContatos();
        System.out.println();
        System.out.println(contato.pesquisarPorNome("Maria"));
        System.out.println();
        contato.removerContato("Paula Maria");
        contato.exibirContatos();
    }
}

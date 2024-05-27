package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Valmilson", 123456);
        agendaContatos.adicionarContato("Valmilson", 123455);
        agendaContatos.adicionarContato("Valmilson Java", 124456);
        agendaContatos.adicionarContato("Valmilson Estudante", 123356);
        agendaContatos.adicionarContato("Valmilson Aprendiz", 123556);
        agendaContatos.adicionarContato("Valmilson DevJava", 123656);

        agendaContatos.exibirContatos();
        System.out.println();

        System.out.println(agendaContatos.pesquisarPorNome("Valmilson Java"));
        System.out.println();

        System.out.println("Contato atualizado: "+agendaContatos.atualizarNumeroContato("Valmilson DevJava", 123789));
    }
}

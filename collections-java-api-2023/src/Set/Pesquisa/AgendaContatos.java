package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
      private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome,int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }// if
        }// for
        return contatosPorNome;
    }// void

    public Contato atualizarNumeroContato(String nome,int novoNumero){
           Contato contatoAtualizado = null;
           for(Contato c:contatoSet){
               if(c.getNome().equalsIgnoreCase(nome)){
                   c.setNumero(novoNumero);
                   contatoAtualizado = c;
                   break;
               }// if
           }// for
           return contatoAtualizado;
    }// void
    // MAIN
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        // exibindo Lista de contatos vazia
        System.out.println("Lista de Contatos");
        agendaContatos.exibirContatos();
        // adicionando contatos
        System.out.println("\n Adicionado contatos");
        agendaContatos.adicionarContato("Camila",123456);
        agendaContatos.adicionarContato("Camila",5665);
        agendaContatos.adicionarContato("Camila Cavalcante",1111111);
        agendaContatos.adicionarContato("Camila Dio",654987);
        agendaContatos.adicionarContato("Maria Silva",1111111);

        // exibindo lista de contatos preenchida
        System.out.println("Lista de Contatos preenchida");
        agendaContatos.exibirContatos();
        //pesquisa por nome
        System.out.println("\n Pesquisa pir nome");
        System.out.println(agendaContatos.pesquisaPorNome("Camila"));

        // Atualizando Contato
        System.out.println("Contato alterado ");
        System.out.println(agendaContatos.atualizarNumeroContato("Maria Silva",22222));
        System.out.println("Lista com contato atualizado");
        agendaContatos.exibirContatos();

    }// main
}// class

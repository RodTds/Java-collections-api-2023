package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome,Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }
    public void erro(boolean er){
        if(er == false)
            System.out.println("Nome não encontrado");
    }
    public Integer pesquisaPorNome(String nome){

        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila Dio", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        int total = agendaContatos.agendaContatoMap.size();
        System.out.println(total);
        agendaContatos.removerContato("Maria Silva");
        total = agendaContatos.agendaContatoMap.size();
        agendaContatos.exibirContato();
        System.out.println(total);
        System.out.println(" Pesquisa Por Nome é " + agendaContatos.pesquisaPorNome("Camila"));
    }

}// classe

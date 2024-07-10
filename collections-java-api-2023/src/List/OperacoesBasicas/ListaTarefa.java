package List.OperacoesBasicas;


import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;

    //contrutor ojeto lista tarefa

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
         List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTrefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O Número Total  de Elementos de Tarefas é " +listaTarefa.obterNumeroTotalTarefas() +"\n");
        System.out.println(" Adicionando Tarefas \n");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O Número Total  de Elementos de Tarefas é " +listaTarefa.obterNumeroTotalTarefas());

        System.out.println("\n Removendo Tarefas \n");
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O Número Total  de Elementos de Tarefas é " +listaTarefa.obterNumeroTotalTarefas());

        System.out.println(" Obtendo Descrições das Tarefas ");
        listaTarefa.obterDescricoesTrefas();
    }
}

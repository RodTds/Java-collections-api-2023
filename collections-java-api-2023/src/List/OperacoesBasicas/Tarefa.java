package List.OperacoesBasicas;

public class Tarefa {
    // Atributo
    private String descricao;

    // construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    // get
    public String getDescricao() {
        return descricao;
    }
    // set
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao ;
    }
}

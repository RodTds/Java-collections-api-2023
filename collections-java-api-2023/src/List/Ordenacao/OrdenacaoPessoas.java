package List.Ordenacao;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
       private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome,int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    // ordenar por idade
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura,new comparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 1",20,1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 2",30,1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 3",25,1.70);
        ordenacaoPessoas.adicionarPessoa("Nome 4",17,1.56);
        System.out.println("Ordenado Por IDADE ");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println("Ordenado por ALTURA ");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    } // main
}// classe Ordenacao Pessoas

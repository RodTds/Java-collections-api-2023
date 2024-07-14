package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // atributo
    private Set<String> palavrasUnicasSet;
    // construtor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }
    public void adicionarPalavras(String palavra){
        palavrasUnicasSet.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        }
        else {
            System.out.println("O conjunto está vazio!");
        }// else
    }// void

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    // MAIN
    public static void main(String[] args) {
        // criando instancia da classe
        ConjuntoPalavrasUnicas palavra = new ConjuntoPalavrasUnicas();

        // adicionando palavras
        palavra.adicionarPalavras("Java");
        palavra.adicionarPalavras("Python");
        palavra.adicionarPalavras("JavaScript");
        palavra.adicionarPalavras("Python");
        palavra.adicionarPalavras("C++");
        palavra.adicionarPalavras("Ruby");

        // exibindo lista de palavras
        palavra.exibirPalavrasUnicas();
        // ou  System.out.println(palavra.palavrasUnicasSet);

        // Removendo uma linguagem do conjunto
        palavra.removerPalavra("Python");
        palavra.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        palavra.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + palavra.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + palavra.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        palavra.exibirPalavrasUnicas();

    }// main

}// classe

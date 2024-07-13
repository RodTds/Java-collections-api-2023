package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();

    }
    public void adicionarNumeros(int numero){
       this.numeroList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> nascendente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            Collections.sort(nascendente);
            return nascendente;
        } // if
        else{
            throw new RuntimeException(" A lista esta vazia");
        }// else
    }// void

    public List<Integer> ordenarDescendente() {
        List<Integer> descendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()) {
            descendente.sort(Collections.reverseOrder());
            return descendente;
        } // if
        else {
            throw new RuntimeException(" A lista esta vazia");
        }// else
    }
    public void exibirNumeros() {
            if (!numeroList.isEmpty()) {
                System.out.println(this.numeroList);
            } else {
                System.out.println("A lista está vazia!");
            }
        }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumeros(2);
        numeros.adicionarNumeros(5);
        numeros.adicionarNumeros(4);
        numeros.adicionarNumeros(1);
        numeros.adicionarNumeros(99);

        numeros.exibirNumeros();
        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());

    }


    }// classe

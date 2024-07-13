package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivros {
    private List<Livro> livroList;

    public catalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
          for(Livro l: livroList){
              if(l.getAutor().equalsIgnoreCase(autor)){
                  livroPorAutor.add(l);
              }
          }
        }
        return livroPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
          for(Livro l: livroList){
              if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                   livroPorIntervaloAnos.add(l);
              }
          }// for
        }// if
        return livroPorIntervaloAnos;
    }// void
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }// ifff
            }// for

        }// IF
        return livroPorTitulo;
    } // void

    // MAIN
    public static void main(String[] args) {
        catalogoLivros catlivros = new catalogoLivros();

        catlivros.adicionarLivro("Livro 1","Autor 1", 2020);
        catlivros.adicionarLivro("Livro 1","Autor 2", 2021);
        catlivros.adicionarLivro("Livro 2","Autor 2", 2022);
        catlivros.adicionarLivro("Livro 3","Autor 3", 2023);
        catlivros.adicionarLivro("Livro 4","Autor 4", 1994);

        System.out.println("Pesquisa Por Autor ");
        System.out.println(catlivros.pesquisarPorAutor("Autor 2"));

        System.out.println("Pesquisa Por TITULO ");
        System.out.println(catlivros.pesquisarPorTitulo("Livro 1"));

        System.out.println("Pesquisa Por Intervalo Ano ");
        System.out.println(catlivros.pesquisarPorIntervaloAnos(2021,2023));

        System.out.println("Catálogo Completo");
        System.out.println(catlivros.livroList);

    }

}// classe

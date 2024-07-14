package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
     // atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome,int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int  codigoConvite){
         Convidado convidadoParaRemover = null;
         for(Convidado c:convidadoSet){
             if(c.getCodigoConvite() == codigoConvite){
                 convidadoParaRemover = c;
                 break;
             }// if
         }// for
         convidadoSet.remove(convidadoParaRemover);
    }// void

    public int contarConvidados(){
         return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    // MAIN
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        // exibindo lista Zero convidados
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " , convidados dentro do SET de convidados");
        // adicionando conviddos no hashSet
        System.out.println("\nAdicionado convidados  ");
        conjuntoConvidados.adicionarConvidado("Convidade 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidade 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidade 3", 1235);// convite duplicado, metodo objeto convidado excluiu
        conjuntoConvidados.adicionarConvidado("Convidade 4", 1236);
        // exibindo quantidade de convidados adicionado
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " , dentro do SET de convidados");

        // mostrando a lista de convidados
        System.out.println("\nLista de Convidados \n");
        conjuntoConvidados.exibirConvidados();
        // removendo convidados pelo numero convite
        System.out.println("Removendo Convidado");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        // exibindo a novas quantidade de convidados
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " , dentro do SET de convidados");
        // exibindo nova lista de convidados
        System.out.println(" Nova Lista de convidados ");
        conjuntoConvidados.exibirConvidados();

    } // main
} // classe

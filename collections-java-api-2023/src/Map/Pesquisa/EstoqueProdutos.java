package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
      private  Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long codigo,String nome,int quantidade, double preco){
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }// for
        }// IF
        return valorTotalEstoque;
    }//  void
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
        for(Produto p: estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p; // diferente do maior preco
            }//if
            }//for
        }//IF
        return produtoMaisCaro;
    }// void

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco(); // diferente do maior preco
                }//if
            }//for
        }//IF
        return produtoMaisBarato;
    }// void

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }



    // main
    public static void main(String[] args) {
        // ***** PERGUNTAR SOBRE O CODIGO< COMO ELE È ADICIONADO SEM estar atribuido no objeto PRODUTO
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();
        estoqueProdutos.adicionarProduto(1l,"Produto A",10,5.6);
        estoqueProdutos.adicionarProduto(2l,"Produto B",5,10.0);
        estoqueProdutos.adicionarProduto(3l,"Produto C",2,15.0);

        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.estoqueProdutosMap.size());
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}// classe

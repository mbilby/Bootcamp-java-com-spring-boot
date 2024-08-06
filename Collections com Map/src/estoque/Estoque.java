package estoque;

import java.util.HashMap;
import java.util.Map;
import model.Produto;

public class Estoque {

    private Map<Long, Produto> estoqueProdutoMap;


    public Estoque() {
        this.estoqueProdutoMap = new HashMap<>();
    }
    
    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {

        this.estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
    }


    public void removerProduto(Long cod) {

        if (!estoqueProdutoMap.isEmpty()) {
            estoqueProdutoMap.remove(cod);
        }
    }

    // public void pesquisaProdutoPorCodigo(Long cod) {

    //     if (!estoqueProdutoMap.isEmpty()) {
    //         for (Long c : estoqueProdutoMap.get(cod)) {
    //             if (c == cod) {

    //             }
    //         }
    //     }
    // }

    public double calcularValorTotalEstoque () {

        double valorTotalEstoque = 0d;

        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {

        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p: estoqueProdutoMap.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {

        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p: estoqueProdutoMap.values()) {
                if(p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
     
            }
        }
        return produtoMaisBarato;
    }

    public void exibirProdutos() {

        System.out.println(estoqueProdutoMap);

    }
}

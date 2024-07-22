package classes;

import java.util.ArrayList;

public class ListaDeProdutos {
    private ArrayList<Produto> lista = new ArrayList<>();
    
    public void adicionarProduto(int codigo, double valorDeVenda, String descricao){
        Produto novoProduto = new Produto(codigo, valorDeVenda, descricao);
        lista.add(novoProduto);
    };

    public void removerProduto(){};

    public ArrayList<Produto> listarProdutos(){
        return lista;
    };

    public void visualizarProdutoProduto(){};

    public void pesquisarProduto(){};

    public void atualizarProduto(){};

    public void existeProduto(){};
}

package classes;

import interfaces.ProdutoInterface;

public class Produto implements ProdutoInterface {
    private int codigo;
    private double valorDeVenda;
    private String descricao;

    public Produto(int codigo, double valorDeVenda, String descricao) {
        this.codigo = codigo;
        this.valorDeVenda = valorDeVenda;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void adicionarProduto() {
        // TODO Auto-generated method stub

        throw new UnsupportedOperationException("Unimplemented method 'adicionarProduto'");
    }

    @Override
    public void removerProduto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerProduto'");
    }

    @Override
    public void atualizarProduto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarProduto'");
    }

    @Override
    public void visualizarProduto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visualizarProduto'");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return descricao.toString();
    }
    
}

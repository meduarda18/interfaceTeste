package classes;
public class ItemDeVenda {
    private int quantidade;
    private double valorUnitario;
    private int tamanho;

    public ItemDeVenda(int quantidade, int valorUnitario, int tamanho){
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }   

}

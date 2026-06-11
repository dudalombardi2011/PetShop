package entidades;
public class Item {
    private Produto produto;
    private int quantidade;
    private double valorUnitario;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = produto.getValor(); // Pega o preço no momento da compra
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double calcularSubTotal(){
        return quantidade*valorUnitario;
    }

    //ajeitar
    @Override
    public String toString() {
        return "Item [produto=" + produto + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario + "]";
    }

   
}

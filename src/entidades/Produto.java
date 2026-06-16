package entidades;
public class Produto {
    private String nome;
    private Integer codigo;
    private Double valor;
    private Integer quantidadeEstoque;

    public Produto(String nome, Integer codigo, Double valor, Integer quantidadeEstoque){
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void addEstoque(int qtd){
        quantidadeEstoque+=qtd;
    }

    public void removeEstoque(int qtd){
        quantidadeEstoque-=qtd;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Nome: " + nome + " | Preço: R$ " + String.format("%.2f", valor) + " | Estoque: " + quantidadeEstoque;
    }

    public String toTableRow() {
        return String.format("%-8d | %-25s | R$ %-9.2f | %-8d", codigo, nome, valor, quantidadeEstoque);
    }
}

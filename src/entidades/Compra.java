package entidades;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Compra{
    private Integer id;
    private LocalDateTime dataHora;
    private Cliente cliente;
    private ArrayList<Item> itens;
    private ArrayList<Servico> servicos;
    private FormaPagamento formaPagamento;

    public Compra(Integer id, LocalDateTime dataHora, Cliente cliente, ArrayList<Item> itens) {
        this.id = id;
        this.dataHora = dataHora;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.servicos = new ArrayList<>();
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ArrayList<Item> getItens() {
        return itens;
    }
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void adicionarItem(Item itens) {
        this.itens.add(itens);
    }
    public void adicionarServico(Servico servico) {
        this.servicos.add(servico);
    }

    @Override
    public String toString() {
        double valorBruto = calcularValorBruto();
        double valorFinal;

        if (this.formaPagamento != null) {
            valorFinal = formaPagamento.calculaValorFinal(valorBruto);
        } else {
            valorFinal = valorBruto; // Se ainda não pagou, o valor final é igual ao bruto
        }

        return "--- RESUMO DA COMPRA ---\n" +
                "Cliente: " + cliente.getNome() + "\n" +
                "Valor Bruto: R$ " + String.format("%.2f", valorBruto) + "\n" +
                "Valor Final a Pagar: R$ " + String.format("%.2f", valorFinal);
    }

    public double calcularValorBruto() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.calcularSubTotal();
        }
        for (Servico servico : servicos) {
            total += servico.calculaValor();
        }
        return total;
    }

    public void finalizarCompra(FormaPagamento pagamentoEscolhido) {
        this.formaPagamento = pagamentoEscolhido;
        
        System.out.println(this);
    }

    
}

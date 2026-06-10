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
        listaDeItens.add(itens);
    }
    public void adicionarServico(Servico servico) {
        this.servicos.add(servico);
    }

    public double calcularValorBruto() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.calcularSubtotal();
        }
        for (Servico servico : servicos) {
            total += servico.calcularValorFinal();
        }
        return total;
    }

    public void finalizarCompra(FormaPagamento pagamentoEscolhido) {
        this.formaPagamento = pagamentoEscolhido;
        double valorBruto = calcularValorBruto();

        double valor = formaPagamento.calcularValorFinal(valorBruto);

        System.out.println("--- RESUMO DA COMPRA ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Valor Bruto: R$ " + valorBruto);
        System.out.println("Valor Final a Pagar: R$ " + valor);
    }

    
}

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Compra{
    private Integer id;
    private LocalDateTime dataHora;
    private Cliente cliente;
    private ArrayList<Itens> listaDeItens;
    private FormaPagamento formaPagamento;

    public Compra(Integer id, LocalDateTime dataHora, Cliente cliente, ArrayList<Itens> listaDeItens) {
        this.id = id;
        this.dataHora = dataHora;
        this.cliente = cliente;
        this.listaDeItens = listaDeItens;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ArrayList<Itens> getListaDeItens() {
        return listaDeItens;
    }
    public void setListaDeItens(ArrayList<Itens> listaDeItens) {
        this.listaDeItens = listaDeItens;
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

    

    //@Override
    //public 

    //adicionarItem
    //CalcularValorBruto
    //FinalizarCompra

    
}

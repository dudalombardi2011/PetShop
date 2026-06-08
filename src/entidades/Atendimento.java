import java.time.LocalDateTime;
import java.util.ArrayList;

public class Atendimento {
    private int id;
    private LocalDateTime data;
    private double valorTotal;
    private Cliente cliente;
    private ArrayList<Servico> servicos;

    public Atendimento(int id, LocalDateTime data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }

    public void addServico(Servico servico){
        servicos.add(servico);
        valorTotal+= servico.getValor();
    }

    //melhorar 
    @Override
    public String toString() {
        return "Atendimento [id=" + id + ", data=" + data + ", valorTotal=" + valorTotal + ", cliente=" + cliente
                + ", servicos=" + servicos + "]";
    }

    
}

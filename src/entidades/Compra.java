import java.util.ArrayList;

public class Compra {
    private Cliente cliente;
    private ArrayList<Itens> listaDeItens;
    
    public Compra(Cliente cliente, ArrayList<Itens> listaDeItens) {
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

    
    
}

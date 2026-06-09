import java.util.ArrayList;

public class GerenciadorPetShop {
    private ArrayList<Cliente> clientes;
    private ArrayList <Compra> compras;

    //construtor 
    public GerenciadorPetShop() {
        this.clientes = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    

    //RegistrarCompra  

}

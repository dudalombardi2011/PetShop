import java.util.ArrayList;

public class GerenciadorPetShop {
    private ArrayList<Cliente> clientes;
    private ArrayList <Atendimento> atendimentos;

    //construtor 
    public GerenciadorPetShop() {
        this.clientes = new ArrayList<>();
        this.atendimentos = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

       public void cadastrarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    //ta faltando coisa

    

    

}

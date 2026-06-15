package entidades;
import entidades.Porte;

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

    public void carregarDadosIniciais() {
        // 1. Criando 7 Clientes
        Cliente c1 = new Cliente(1, "Duda Lombardi", 11111);
        Cliente c2 = new Cliente(2, "Artur Silveira", 22222);
        Cliente c3 = new Cliente(3, "Artur 'Certinho'", 33333);
        Cliente c4 = new Cliente(4, "Israel Gabriel", 44444);
        Cliente c5 = new Cliente(5, "João Lisboa", 55555);
        Cliente c6 = new Cliente(6, "Antonio Nunes", 66666);
        Cliente c7 = new Cliente(7, "Clara dos Anjos", 77777);

        // 2. Criando 7 Animais (int id, String nome, String especie, String raca, int idade, Porte porte)
        Animal a1 = new Animal(1, "Apolo","Cachorro","Border Collie",6, Porte.MEDIO);
        Animal a2 = new Animal(1, "Stela","Cachorro","Border Collie",5, Porte.MEDIO);
        Animal a3 = new Animal(2, "Mimi", "Gato", "Siamês", 2, Porte.PEQUENO);
        Animal a4 = new Animal(3, "Bob", "Cachorro", "Pug", 4, Porte.PEQUENO);
        Animal a5 = new Animal(4, "Astolfo", "Ave", "Periquito", 1, Porte.PEQUENO);
        Animal a6 = new Animal(5, "Luna", "Gato", "Persa", 5, Porte.PEQUENO);
        Animal a7 = new Animal(6, "Max", "Cachorro","Bulldog", 2, Porte.MEDIO);
        Animal a8 = new Animal(7, "Mel", "Cachorro", "Poodle", 6, Porte.PEQUENO);

        c1.adicionarAnimal(a1);
        c1.adicionarAnimal(a2);
        c2.adicionarAnimal(a3);
        c3.adicionarAnimal(a4);
        c4.adicionarAnimal(a5);
        c5.adicionarAnimal(a6);
        c6.adicionarAnimal(a7);
        c7.adicionarAnimal(a8);

        // Adicionando os clientes na lista da PRÓPRIA classe
        this.cadastrarCliente(c1);
        this.cadastrarCliente(c2);
        this.cadastrarCliente(c3);
        this.cadastrarCliente(c4);
        this.cadastrarCliente(c5);
        this.cadastrarCliente(c6);
        this.cadastrarCliente(c7);
    }

}

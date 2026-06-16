package entidades;
import entidades.Porte;
import java.time.LocalDateTime; 

import java.util.ArrayList;

public class GerenciadorPetShop {
    private ArrayList<Cliente> clientes;
    private ArrayList <Compra> compras;
    private ArrayList<Produto> produtos;

    //construtor 
    public GerenciadorPetShop() {
        this.clientes = new ArrayList<>();
        this.compras = new ArrayList<>();
        this.produtos = new ArrayList<>();
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

    public void cadastrarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Cliente buscarClientePorCpf(int cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente; 
            }
        }
        return null;
    }

    //criando os dados iniciais 
    public void carregarDadosIniciais() {
       
        Cliente c1 = new Cliente(1, "Duda Lombardi", 11111, "dudalombardi@gmail.com");
        Cliente c2 = new Cliente(2, "Artur Silveira", 22222, "artursilveira@gmail.com");
        Cliente c3 = new Cliente(3, "Artur 'Certinho'", 33333, "arturcertinho@gmail.com");
        Cliente c4 = new Cliente(4, "Israel Gabriel", 44444, "israelgabriel@gmail.com");
        Cliente c5 = new Cliente(5, "João Lisboa", 55555, "joaolisboa@hotmail.com");
        Cliente c6 = new Cliente(6, "Antonio Nunes", 66666, "antonionunes@yahoo.com.br");
        Cliente c7 = new Cliente(7, "Clara dos Anjos", 77777, "claradosanjos@outlook.com");

        
        Animal a1 = new Animal(1, "Apolo","Cachorro","Border Collie",6, Porte.MEDIO);
        Animal a2 = new Animal(2, "Stela","Cachorro","Border Collie",5, Porte.MEDIO);
        Animal a3 = new Animal(3, "Lesk", "Cachorro", "West Highland White Terrier", 4, Porte.PEQUENO);
        Animal a4 = new Animal(4, "Internacional", "Pato", "Chorão", 47, Porte.PEQUENO);
        Animal a5 = new Animal(5, "Astolfo", "Ave", "Periquito", 1, Porte.PEQUENO);
        Animal a6 = new Animal(6, "Luna", "Gato", "Persa", 5, Porte.PEQUENO);
        Animal a7 = new Animal(7, "Max", "Cachorro","Bulldog", 2, Porte.MEDIO);
        Animal a8 = new Animal(8, "Mel", "Cachorro", "Poodle", 6, Porte.PEQUENO);
        Animal a9 = new Animal(9, "Floco", "Gato", "SRD", 8, Porte.PEQUENO);
        Animal a10 = new Animal(10, "Magali", "Gato", "SRD", 8, Porte.PEQUENO);

        c1.adicionarAnimal(a3);
        c2.adicionarAnimal(a1);
        c2.adicionarAnimal(a2);
        c3.adicionarAnimal(a4);
        c4.adicionarAnimal(a5);
        c4.adicionarAnimal(a6);
        c5.adicionarAnimal(a9);
        c5.adicionarAnimal(a10);
        c6.adicionarAnimal(a7);
        c7.adicionarAnimal(a8);

    
        this.cadastrarCliente(c1);
        this.cadastrarCliente(c2);
        this.cadastrarCliente(c3);
        this.cadastrarCliente(c4);
        this.cadastrarCliente(c5);
        this.cadastrarCliente(c6);
        this.cadastrarCliente(c7);

        Produto p1 = new Produto("Ração Premier 15kg", 101, 150.0, 20);
        Produto p2 = new Produto("Ração Golden 10kg", 102, 120.0, 15);
        Produto p3 = new Produto("Osso de Borracha", 103, 15.50, 50);
        Produto p4 = new Produto("Arranhador para Gatos", 104, 80.0, 10);
        Produto p5 = new Produto("Shampoo Pet", 105, 25.0, 30);
        Produto p6 = new Produto("Coleira Antipulgas", 106, 45.0, 25);
        Produto p7 = new Produto("Petisco Sabor Carne", 107, 12.0, 100);

        this.cadastrarProduto(p1); 
        this.cadastrarProduto(p2); 
        this.cadastrarProduto(p3);
        this.cadastrarProduto(p4); 
        this.cadastrarProduto(p5); 
        this.cadastrarProduto(p6);
        this.cadastrarProduto(p7);

        LocalDateTime agora = LocalDateTime.now();
        Servico s1 = new Banho(agora, a1);
        Servico s2 = new Tosa(agora, a2);
        Servico s3 = new ConsultaVeterinaria(agora, a3);
        Servico s4 = new Banho(agora, a4);
        Servico s5 = new Tosa(agora, a5);
        Servico s6 = new Banho(agora, a6);
        Servico s7 = new ConsultaVeterinaria(agora, a7);

        Compra com1 = new Compra(1, agora, c1, new ArrayList<>()); 
        com1.adicionarServico(s1);
        Compra com2 = new Compra(2, agora, c2, new ArrayList<>()); 
        com2.adicionarServico(s2);
        Compra com3 = new Compra(3, agora, c3, new ArrayList<>()); 
        com3.adicionarServico(s3);
        Compra com4 = new Compra(4, agora, c4, new ArrayList<>()); 
        com4.adicionarServico(s4);
        Compra com5 = new Compra(5, agora, c5, new ArrayList<>()); 
        com5.adicionarServico(s5);
        Compra com6 = new Compra(6, agora, c6, new ArrayList<>()); 
        com6.adicionarServico(s6);
        Compra com7 = new Compra(7, agora, c7, new ArrayList<>()); 
        com7.adicionarServico(s7);

        //adiciona item na compra
        com1.adicionarItem(new Item(p1, 1));
        com2.adicionarItem(new Item(p3, 2));
        com3.adicionarItem(new Item(p5, 1));
        com4.adicionarItem(new Item(p2, 1));
        com5.adicionarItem(new Item(p4, 1));
        com6.adicionarItem(new Item(p7, 3));
        com7.adicionarItem(new Item(p6, 1));

        compras.add(com1); 
        compras.add(com2); 
        compras.add(com3); 
        compras.add(com4);
        compras.add(com5); 
        compras.add(com6); 
        compras.add(com7);
    }

}

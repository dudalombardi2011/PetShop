import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private int cpf;
    private ArrayList<Animal> animais = new ArrayList<>();
    
    public Cliente(int id, String nome, int cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    
}

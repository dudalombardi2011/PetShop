package entidades;
import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private int cpf;
    private String email;
    private ArrayList<Animal> animais = new ArrayList<>();
    
    public Cliente(int id, String nome, int cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    
}

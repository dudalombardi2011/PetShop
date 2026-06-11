
public abstract class Animal{
    private int id; 
    private String nome;
    private String raca;
    private int idade;
    private Porte porte;

    public Animal(int id, String nome, String raca, int idade, Porte porte) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
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
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Porte getPorte() {
        return porte;
    }
    public void setPorte(Porte porte) {
        this.porte = porte;
    }
}
import java.time.LocalDateTime;

public abstract class Servico{
    private LocalDateTime horario;
    private Double valorBase;
    private Animal animal;

    public Servico(LocalDateTime horario, Double valorBase, Animal animal) {
        this.horario = horario;
        this.valorBase = valorBase;
        this.animal = animal;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valorBase;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }

    public abstract Double calculaValor();
}


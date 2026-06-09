import java.time.LocalDateTime;

public abstract class Servico implements Agendavel{
   
    private LocalDateTime horario;
    private double valor;

    public Servico(LocalDateTime horario, double valor) {
        this.horario = horario;
        this.valor = valor;
    }

    @Override
    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }

    public abstract void calculaValor(Porte porte);
}


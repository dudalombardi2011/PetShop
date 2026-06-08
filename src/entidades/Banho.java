import java.time.LocalDateTime;

public class Banho extends Servico {

    private LocalDateTime horario;

    public Banho(LocalDateTime horario) {
        this.horario = horario;
    }

    @Override
    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    //pensar em alguma logica para botar aqui 
    @Override
    public void executarServico(){
        System.out.println("Executando banho");
    }
    
    
}

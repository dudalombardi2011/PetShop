import java.time.LocalDateTime;

public class ConsultaVeterinaria extends Servico{
    
    private LocalDateTime horario;

    public ConsultaVeterinaria(LocalDateTime horario) {
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
        System.out.println("Executando consulta veterinaria");
    }
    
}

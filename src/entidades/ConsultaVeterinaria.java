import java.time.LocalDateTime;

public class ConsultaVeterinaria extends Servico{
    
    public ConsultaVeterinaria(LocalDateTime horario) {
        super(horario, 50.0);
    }

    //pensar em alguma logica para botar aqui 
    @Override
    public void executarServico(){
        System.out.println("Executando banho");
    }
    
    
}

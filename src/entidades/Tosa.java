import java.time.LocalDateTime;

public class Tosa extends Servico{
    
     public Tosa(LocalDateTime horario) {
        super(horario, 40.0);
    }

    //pensar em alguma logica para botar aqui 
    @Override
    public void executarServico(){
        System.out.println("Executando banho");
    }
    
}

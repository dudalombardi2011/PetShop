import java.time.LocalDateTime;

public class ConsultaVeterinaria extends Servico{
    
    public ConsultaVeterinaria(LocalDateTime horario) {
        super(horario, 100.0); // Mudar lógica
    }

    //pensar em alguma logica para botar aqui 
    @Override
    public void calculaValor(Porte porte){
        System.out.println("Executando banho");
    }
    
    
}

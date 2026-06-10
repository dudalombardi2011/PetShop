import java.time.LocalDateTime;

public class ConsultaVeterinaria extends Servico{
    
    public ConsultaVeterinaria(LocalDateTime horario) {
        super(horario, 100.0); // Mudar lógica
    }

    @Override
    public void calculaValor(){
        return this.getValorBase();
    }
    
    
}

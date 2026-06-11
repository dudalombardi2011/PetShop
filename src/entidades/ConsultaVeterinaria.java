import java.time.LocalDateTime;

public class ConsultaVeterinaria extends Servico{
    
    public ConsultaVeterinaria(LocalDateTime horario, Animal animal) {
        super(horario, 100.0, animal ); // Mudar lógica
    }

    @Override
    public Double calculaValor(){
        return this.getValorBase();
    }
    
    
}

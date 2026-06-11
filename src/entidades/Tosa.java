import java.time.LocalDateTime;

public class Tosa extends Servico{
    
     public Tosa(LocalDateTime horario, Animal animal) {
        super(horario, 30.0, animal); // Mudar lógica
    }

    @Override
    public Double calculaValor(){
        Porte porte = this.getAnimal().getPorte();

        if (porte == Porte.GRANDE) {
            return this.getValorBase() * 1.5;
        } else if (porte == Porte.MEDIO) {
            return this.getValorBase() * 1.25;
        }
        return this.getValorBase();
    }
}

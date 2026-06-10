import java.time.LocalDateTime;

public class Tosa extends Servico{
    
     public Tosa(LocalDateTime horario) {
        super(horario, 30.0); // Mudar lógica
    }

    @Override
    public void calculaValor(){
        Porte porte = this.getAnimal().getPorte();

        if (porte == Porte.GRANDE) {
            return this.getValorBase() * 1.5;
        } else if (porteDoAnimal == Porte.MEDIO) {
            return this.getValorBase() * 1.25;
        }
        return this.getValorBase();
    }
}

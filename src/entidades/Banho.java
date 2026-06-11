import java.time.LocalDateTime;

public class Banho extends Servico {

    public Banho(LocalDateTime horario, Animal animal) {
        super(horario, 50.0, animal);
    }

    @Override
    public Double calculaValor(){
        Porte porte = this.getAnimal().getPorte();

        if (porte == Porte.GRANDE) {
            return this.getValorBase() * 2.0;
        } else if (porte == Porte.MEDIO) {
            return this.getValorBase() * 1.5;
        }
        return this.getValorBase();
    }
    
}

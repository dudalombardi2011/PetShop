import entidades.enums.Porte;

import java.time.LocalDateTime;

public class Banho extends Servico {

    public Banho(LocalDateTime horario) {
        super(horario, 50.0);
    }

    //pensar em alguma logica para botar aqui 
    @Override
    public abstract void calculaValor(String raca, Porte porte){

    }
    
    
}

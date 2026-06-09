import java.time.LocalDateTime;

public class Banho extends Servico {

    public Banho(LocalDateTime horario) {
        super(horario, 50.0);
    }

    //pensar em alguma logica para botar aqui 
    @Override
    public void calculaValor(Porte porte){
        System.out.println("Fazer uma funcao aqui");
    }
    
    
}

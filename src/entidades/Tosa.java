import java.time.LocalDateTime;

public class Tosa extends Servico{
    
     public Tosa(LocalDateTime horario) {
        super(horario, 40.0); // Mudar lógica
    }

    //pensar em alguma logica para botar aqui 
    @Override
    public void calculaValor(Porte porte){
        System.out.println("Executando banho");
    }
    
}

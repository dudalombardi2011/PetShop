public class Cachorro extends Animal{

    public Cachorro(int id, String nome, String raca, int idade) {
        super(id, nome, raca, idade);
    }

    //pensar em outro metodo para implementar, esse nao faz sentido 
    @Override
    public void emitirSom(){
        System.out.println("Au au");
    }
}

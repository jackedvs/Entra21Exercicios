package POO.Polimorfismo.ExemplosPolimorfismo.PolimorfismoExemplo1;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void perseguirCarteiro() {
        System.out.println("Volta aqui au au");
    }
}

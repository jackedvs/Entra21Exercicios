package Prog.OO.Polimorfismo.ExerciciosPolimorfismo.exerUM;

public class Principal {
    public static void main(String[] args) {
        Animal animalc = new Animal();
        Animal toto = new Cachorro();
        Animal surya = new Gato();

        animalc.emitirSom();
        toto.emitirSom();
        surya.emitirSom();


    }
}

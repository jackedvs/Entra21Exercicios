package POO.Abstracao.ListExeAbs.exerUm;

public class Main {
    public static void main(String[] args) {
        AnimalAbstract cachorro = new Cachorro();
        AnimalAbstract gato = new Gato();

        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());





    }
}
package Prog.OO.Abstracao.ExerciciosAbstracao.exerDois;

public class Main {
    public static void main(String[] args) {
        VeiculoAbstract carro = new Carro();
        VeiculoAbstract Bike = new Bike();

        System.out.println(carro.mover());
        System.out.println(Bike.mover());
    }
}

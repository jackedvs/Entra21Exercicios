package Prog.OO.Polimorfismo.ExerciciosPolimorfismo.exerDois;

public class Principal {
    public static void main(String[] args) {
        Veiculo veiculoA = new Veiculo();
        Veiculo Carro = new Carro();
        Veiculo Bike = new Bike();
        Veiculo Camelo = new Camelo();

        veiculoA.mover();
        Carro.mover();
        Bike.mover();
        Camelo.mover();
    }
}

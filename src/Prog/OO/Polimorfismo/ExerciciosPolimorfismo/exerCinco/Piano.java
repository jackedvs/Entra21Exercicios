package POO.Polimorfismo.ExerciciosPolimorfismo.exerCinco;

public class Piano extends Instrumento{
    @Override
    public void tocar() {
        System.out.println("Agora o som do Piano");
    }
}

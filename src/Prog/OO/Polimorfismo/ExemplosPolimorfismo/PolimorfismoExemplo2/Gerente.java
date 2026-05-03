package POO.Polimorfismo.ExemplosPolimorfismo.PolimorfismoExemplo2;

public class Gerente extends Funcionario {

    @Override
    public double calcularPagamento() {
        return super.getSalarioBase() + 1.000d;
    }
}

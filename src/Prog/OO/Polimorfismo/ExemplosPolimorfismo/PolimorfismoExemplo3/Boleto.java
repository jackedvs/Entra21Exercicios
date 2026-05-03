package POO.Polimorfismo.ExemplosPolimorfismo.PolimorfismoExemplo3;

public class Boleto extends MetodoDePagamento {
    @Override
    public void pagarAvista() {
        System.out.println("Pagando com boleto");
    }
}

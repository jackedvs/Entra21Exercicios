package Prog.OO.Polimorfismo.ExemplosPolimorfismo.PolimorfismoExemplo3;

public class CartaoDeCredito extends MetodoDePagamento{
    @Override
    public void pagarAvista() {
        System.out.println("Pagando com cartão de credito");
    }
}

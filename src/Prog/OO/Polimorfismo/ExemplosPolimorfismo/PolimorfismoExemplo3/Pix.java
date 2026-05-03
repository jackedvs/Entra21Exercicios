package Prog.OO.Polimorfismo.ExemplosPolimorfismo.PolimorfismoExemplo3;

public class Pix  extends MetodoDePagamento {
    @Override
    public void pagarAvista() {
        System.out.println("Pagando a vista comPix");
    }
}

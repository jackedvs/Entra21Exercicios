package POO.PolimorfismoExemplo3;

public class Carrinho {
    private double valorCompra;

    public Carrinho(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void realizarCompra(MetodoDePagamento metodoDePagamento) {
        metodoDePagamento.pagarAvista();
        System.out.println("Compra realizada com sucesso");
    }
}

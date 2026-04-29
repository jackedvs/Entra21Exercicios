package POO.Heranca.ExemploDois;

public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Jackeline", 100_000d, 500_000d);
        System.out.println("O salário total de "
                + vendedor.getNome() +
                " é " + vendedor.getSalarioTotal());
    }
}

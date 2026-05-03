package POO.Polimorfismo.ExerciciosPolimorfismo.exerSeis;

public class Principal {
   public static void main(String[] args) {
       Conta conta = new Conta();
       Conta c1 = new ContaCorrente();
       Conta c2 = new ContaPoupanca();

       System.out.println(c1.calcularTarifa());
       System.out.println(c2.calcularTarifa() );

    }
}

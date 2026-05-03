package Basico;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(" Ana ", " corrente ", 12345,250);
        ContaBancaria conta2 = new ContaBancaria("Julia ", "Poupança ",32145,480);

        System.out.println(conta1.sacar(300));
        System.out.println(conta1.depositar(200));

        System.out.println(conta2.sacar(500));
        System.out.println(conta2.depositar(700));

    }
}

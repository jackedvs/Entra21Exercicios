package Basico;

public class ContaBancaria {
    String titular, tipoConta;
    int numeroConta;
    double saldo;

    public ContaBancaria(String titular, String tipoConta, int numeroConta, double saldo) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    double depositar(double valor) {
        saldo += valor;
        return saldo;
    }
    double sacar(double valor) {
        saldo = saldo - valor;
        return saldo;
    }

}

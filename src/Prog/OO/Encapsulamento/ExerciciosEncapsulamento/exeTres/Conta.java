package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeTres;

public class Conta {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void sacarValor(double valor) {
        if(valor > saldo) {
            System.out.println("Valor insuficiente");
        } else {
            System.out.println(saldo - valor);
        }
    }
}

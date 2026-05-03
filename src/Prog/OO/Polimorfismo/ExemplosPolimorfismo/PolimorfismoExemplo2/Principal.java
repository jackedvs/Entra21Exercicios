package POO.Polimorfismo.ExemplosPolimorfismo.PolimorfismoExemplo2;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        gerente.setSalarioBase(10_000d);

        System.out.println("O salário do gerente é: " + gerente.calcularPagamento());

        Funcionario funcionarioComun = new Funcionario();
        funcionarioComun.setSalarioBase(3000d);
        System.out.println("O salário do funcionario é: " + funcionarioComun.calcularPagamento());

        Funcionario vendedor = new Vendedor(2000d,3000d);
        System.out.println("O salário do vendedor é: "+ vendedor.calcularPagamento());
    }
}

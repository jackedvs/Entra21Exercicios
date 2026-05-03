package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeUm;

public class Produto {
    private String nome;
    private double preco;

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem <= 50) {
            preco -= preco * (porcentagem / 100);
        } else {
            System.out.println("Desconto não autorizado");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preco inválido");
        }

    }
}


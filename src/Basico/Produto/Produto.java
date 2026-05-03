package Basico.Produto;

public class Produto {
    String nome;
    double preco;
    int quantEstoque, codBarras;

    public Produto(String nome,double preco, int quantEstoque, int codBarras ) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
        this.codBarras = codBarras;
    }
    boolean verificarDisponibilidade(){
        return quantEstoque > 0;
    }
    double calcularValorEstoque(){
        return preco * quantEstoque;
    }
}

package Prog.OO.Polimorfismo.ExerciciosPolimorfismo.exerSete;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto livro = new Livro();
        Produto eletronco = new Eletronico();

        livro.exibirDescricao();
        eletronco.exibirDescricao();
    }
}

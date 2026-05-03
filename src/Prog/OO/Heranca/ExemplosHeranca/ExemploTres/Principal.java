package POO.Heranca.ExemplosHeranca.ExemploTres;

public class Principal {
    public static void main(String[] args) {
        Produtos produto = new Produtos();
        produto.setNome("Bonequinho de brinquedo");
        produto.setPreco(100d);

        produto.exibirInformacoes();

        System.out.println("*****************************************");
        Livro livro = new Livro();
        livro.setNome("A gata borralheira");
        livro.setPreco(200);
        livro.setAutor("Juliana Paiva");

        livro.exibirInformacoes();


    }
}

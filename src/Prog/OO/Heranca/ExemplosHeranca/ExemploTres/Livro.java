package Prog.OO.Heranca.ExemplosHeranca.ExemploTres;

public class Livro extends Produtos {

    private  String autor;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Autor: " + this.autor);
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

package Basico;

public class Livro {
    String titulo, autor;
    int numeroPaginas, anoPublicacao, anoAtual;


    public Livro(String titulo, String autor, int numeroPaginas, int anoPublicacao, int anoAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
        this.anoAtual = anoAtual;
    }

    boolean ehLivroAntigo() {
        int anoAtual = java.time.Year.now().getValue();
        return (anoAtual - anoPublicacao) >= 20;
    }
}



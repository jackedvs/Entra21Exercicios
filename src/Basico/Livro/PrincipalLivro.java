package Basico.Livro;

public class PrincipalLivro {
    static void main(String[] args) {
        Livro livro1 = new Livro("Senhor dos aneis", "aroldo", 2000, 1987, 2026);
        Livro livro2 = new Livro("Abelardo Neto", "Arnaldo", 75, 2016, 2026);
        Livro livro3 = new Livro("Amado cretino", "Ze felipe", 300, 2010, 2026);

        livro1.ehLivroAntigo();
        livro2.ehLivroAntigo();
        livro3.ehLivroAntigo();

        if (livro1.ehLivroAntigo()) {
            System.out.println(livro1.titulo + " é um livro antigo");
        } else {
            System.out.println(livro1.titulo + " não é antigo");
        }
        if (livro2.ehLivroAntigo()) {
            System.out.println(livro2.titulo + " é um livro antigo");
        } else {
            System.out.println(livro2.titulo + " não é antigo");
        }
        if (livro3.ehLivroAntigo()) {
            System.out.println(livro3.titulo + " é um livro antigo");
        } else {
            System.out.println(livro3.titulo + " não é antigo");
        }
    }
}

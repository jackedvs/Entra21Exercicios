package Basico.Pessoa;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Jackeline ", 37);

        Pessoa pessoa2 = new Pessoa("Gabriely ", 10);

        if (pessoa1.ehMaiorDeIdade()) {
            System.out.println(pessoa1.nome + "É maior de idade");
        } else {
            System.out.println(pessoa1.nome + "É menor de idade");
        }
        if (pessoa2.ehMaiorDeIdade()) {
            System.out.println(pessoa2.nome +"É maior de idade");
        } else {
            System.out.println(pessoa2.nome + "É menor de idade");
        }
    }
}

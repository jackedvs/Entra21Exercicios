package Basico.Pessoa;

public class Pessoa {
    String nome;
    int idade;

    //public Pessoa() {}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    boolean ehMaiorDeIdade() {
        return idade >= 18;

        }
    }



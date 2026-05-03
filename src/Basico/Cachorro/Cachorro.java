package Basico.Cachorro;

public class Cachorro {
    String nome, raca;
    int idade;
    double peso;

    public Cachorro(String nome, String raca, int idade, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }

    String exibirInformacoes() {
        return "nome: " + nome + "\n" +
                "Raça: " + raca + "\n" +
                "idade: " + idade + "\n" +
                "Peso: " + peso;

    }

    String classificarTamanho() {
        if (peso < 15) {
            return "pequeno";
        } else if (peso >= 15 && peso <= 30) {
            return "medio";
        } else {
            return "grande";
        }
    }
}

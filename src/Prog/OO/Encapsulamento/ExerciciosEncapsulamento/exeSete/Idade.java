package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeSete;

public class Idade {
    private int idade;

    public Idade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 150) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }
}
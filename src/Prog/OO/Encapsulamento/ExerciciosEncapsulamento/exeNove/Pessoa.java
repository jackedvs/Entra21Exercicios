package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeNove;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("Por favor digite um nome válido");
        } else {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 150) {
            System.out.println("Idade inválida");
        } else {
            this.idade = idade;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Email inválido");
        } else {
            this.email = email;
        }
    }
}


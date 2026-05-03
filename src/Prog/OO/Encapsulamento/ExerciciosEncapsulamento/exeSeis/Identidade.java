package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeSeis;

public class Identidade {
    private String nome;
    private String cpf;

    public Identidade(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

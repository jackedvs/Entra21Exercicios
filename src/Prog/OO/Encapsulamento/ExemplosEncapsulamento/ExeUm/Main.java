package Prog.OO.Encapsulamento.ExemplosEncapsulamento.ExeUm;

public class Main {

        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa("Ana", 20);

            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());

            pessoa.setIdade(21);

            System.out.println("Nova idade: " + pessoa.getIdade());
        }
    }


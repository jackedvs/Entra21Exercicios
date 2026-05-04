package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeSete;
public class Principal {
    public static void main(String[] args) {
        Idade pessoa = new Idade(20);

        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.setIdade(200); // inválido
        pessoa.setIdade(30);  // válido

        System.out.println("Nova idade: " + pessoa.getIdade());
    }
}
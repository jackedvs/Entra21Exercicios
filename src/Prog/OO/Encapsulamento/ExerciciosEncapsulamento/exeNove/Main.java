package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeNove;

public class Main {
    public static void main(String[] args) {


        Pessoa p1 = new Pessoa("", 200, "rosanagmail.com");
        Pessoa p2 = new Pessoa("Pedro", 40, "pedro.com");

        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getEmail());
        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getEmail());
    }
}
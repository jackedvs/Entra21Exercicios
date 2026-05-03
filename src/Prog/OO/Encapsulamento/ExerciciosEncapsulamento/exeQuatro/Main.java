package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeQuatro;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("A liberdade", "o mestre");

        System.out.println(l1.getAutor());
        System.out.println(l1.getTitulo());

        l1.setTitulo("A mentira");
        System.out.println(l1.getTitulo());

    }
}

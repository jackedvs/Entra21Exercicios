package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeDois;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Felipe");
        a1.setCurso("Java");
        a1.setIdade(10);
        a2.setNome("Julia");
        a2.setCurso("Phyton");
        a2.setIdade(15);

        System.out.println(a1.getNome());
        System.out.println(a1.getCurso());
        System.out.println(a1.getIdade());

        System.out.println(a2.getNome());
        System.out.println(a2.getCurso());
        System.out.println(a2.getIdade());


    }
}

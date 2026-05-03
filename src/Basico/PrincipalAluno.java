package Basico;

public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro","Java",20201,10,6,8);
        Aluno aluno2 = new Aluno("Julia","IA",20202,5,6,8);

        System.out.println(aluno1.nome);
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println(aluno1.exibirSituacao());

        System.out.println();

        System.out.println(aluno2.nome);
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println(aluno2.exibirSituacao());
    }
}
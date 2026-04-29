package POO.Heranca;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(10,"Fernanda");
        Aluno aluno = new Aluno(18,"Julio","ABCD");

        aluno.apresentar();

        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("Idade aluno: " + aluno.getIdade());
        System.out.println("Matricula aluno: " + aluno.getMatricula());
    }
}

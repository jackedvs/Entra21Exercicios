public class Aluno {
    String nome, curso;
    int matricula;
    double nota1, nota2, nota3;

    public Aluno(String nome, String curso, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    String exibirSituacao() {
        double media = calcularMedia();

        if (media > 6) {
            return "Aluno aprovado";
        } else if (media == 5) {
            return "Aluno em recuperação";
        } else {
            return "Aluno reprovado";
        }
    }
}

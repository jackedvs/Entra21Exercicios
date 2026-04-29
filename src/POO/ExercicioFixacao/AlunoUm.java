package POO.ExercicioFixacao;

public class AlunoUm extends PessoaUm {

    private  int  matricula;

    public AlunoUm(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
        }

    public void exibirInformacoes(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
    }

}

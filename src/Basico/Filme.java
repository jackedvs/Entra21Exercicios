package Basico;

public class Filme {
    String nome, diretor;
    int duracaoEmMinutos, anoLancamento, avaliacao;

    public Filme(String nome, String diretor, int duracaoEmMinutos, int anoLancamento, int avaliacao) {
        this.nome = nome;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;

    }
    String exibirResumo() {
        return "nome: " + nome + "\n" +
                " diretor: " + diretor + "\n" +
                " duração em minutos: " + duracaoEmMinutos + "\n" +
                " Ano de lançamento: " + anoLancamento + "\n" +
                " Avaliação " + avaliacao + "\n";
    }
    boolean ehFilmeExcelente() {
        if(avaliacao > 8) {
            return true;
        } else {
            return  false;
        }
    }
}

package Basico.Cidade;

public class Cidade {
    String nome, estado;
    double populacao, areaKm2;

    public Cidade(String nome, String estado, double populacao, double areaKm2) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
        this.areaKm2 = areaKm2;
    }
    double calcularDensidadePopulacional () {
        return populacao / areaKm2;
    }
    String classificarDensidade () {
        double densidade = calcularDensidadePopulacional();
        if (densidade <= 100) {
            return "Baixa";
        } else if (densidade <= 500) {
            return "Média";
        } else {
            return "Alta";
        }
    }

}

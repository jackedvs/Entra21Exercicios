package Basico.Carro;

public class Carro {
    String marca, modelo;
    int ano;
    double velocidadeMaxima;

    public Carro(String marca, String modelo, int ano, double velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    int calcularIdade() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - ano;
    }
    String exibirDados () {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano +
                "\nVelocidade Máxima: " + velocidadeMaxima;
    }
}

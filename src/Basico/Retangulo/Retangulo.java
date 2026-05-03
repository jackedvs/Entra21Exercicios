package Basico.Retangulo;

public class Retangulo {
    double altura, largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    boolean validarDimensoes() {
        return altura > 0 && largura > 0;
    }

    double calcularArea() {
        return altura * largura;
    }
    double calcularPerimetro() {
        return 2 * (altura + largura);
    }
    boolean ehQuadrado() {
        return altura == largura;
    }

}

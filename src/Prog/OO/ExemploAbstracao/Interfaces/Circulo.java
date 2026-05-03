package Prog.OO.ExemploAbstracao.Interfaces;

public class Circulo implements  IFormaGeometrica{

    private  double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return 0;
    }
}

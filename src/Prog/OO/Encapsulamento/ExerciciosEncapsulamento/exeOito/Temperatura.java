package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeOito;

public class Temperatura {
    private double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getFihrenheit() {
        return (celsius * 9/5) + 32;
    }

}

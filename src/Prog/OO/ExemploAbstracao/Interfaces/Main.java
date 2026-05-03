package POO.ExemploAbstracao.Interfaces;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(3,4);

        System.out.println("A área do circulo é " + circulo.calcularArea());
        System.out.println("A área do Retangulo é " + retangulo.calcularArea());

        //Polimorfismo
        IFormaGeometrica interfaceFormaGeometrica = new Circulo(2);
        interfaceFormaGeometrica.calcularArea();
    }
}

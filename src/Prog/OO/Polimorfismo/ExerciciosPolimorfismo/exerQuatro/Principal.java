package POO.Polimorfismo.ExerciciosPolimorfismo.exerQuatro;

public class Principal {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Forma Circulo = new Circulo();
        Forma Quadrado = new Quadrado();
        Forma Triangulo = new Triangulo();

        forma.desenhar();
        Circulo.desenhar();
        Quadrado.desenhar();
        Triangulo.desenhar();

    }
}

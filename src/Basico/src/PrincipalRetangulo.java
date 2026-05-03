public class PrincipalRetangulo {
    public static void main() {
        Retangulo retangulo1 = new Retangulo(1.5,3.2);
        Retangulo retangulo2 = new Retangulo(2.3,2.3);

        System.out.println(retangulo1.calcularArea());
        System.out.println(retangulo1.calcularPerimetro());
        System.out.println(retangulo1.ehQuadrado());

        System.out.println(retangulo2.calcularArea());
        System.out.println(retangulo2.calcularPerimetro());
        System.out.println(retangulo2.ehQuadrado());
    }
}

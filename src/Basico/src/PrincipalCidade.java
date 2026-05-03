public class PrincipalCidade {
    public static void main(String[] args) {
        Cidade cidade1 = new Cidade("Americana", "Sao Paulo", 550.000, 133.93);
        Cidade cidade2 = new Cidade("Blumenau", "santa Catarina", 400.000, 519.8);

        System.out.println("Cidade " + cidade1.nome);
        System.out.println("Densidade " + cidade1.calcularDensidadePopulacional());
        System.out.println("Classificação " + cidade1.classificarDensidade() + "\n");

        System.out.println("Cidade " + cidade2.nome);
        System.out.println("Densidade " + cidade2.calcularDensidadePopulacional());
        System.out.println("Classificação " + cidade2.classificarDensidade());
    }

}

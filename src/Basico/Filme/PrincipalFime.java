package Basico;

public class PrincipalFime {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Senhor dos aneis", "King", 2, 2000, 9);
        Filme filme2 = new Filme("Como se fosse a primeira vez", "Kelly", 130,1998,5);

        System.out.println(filme1.exibirResumo());
        System.out.println(filme1.ehFilmeExcelente());

        System.out.println(filme2.exibirResumo());
        System.out.println(filme2.ehFilmeExcelente());

    }
}

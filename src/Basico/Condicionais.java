package Basico;

public class Condicionais {

    public static void main(String[] args) {
        if (3 < 5) {
            System.out.println("Maior");
        } else {
            //senao
            System.out.println("Menor");
        }

        int idade = 18;

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade == 18) {
            System.out.println("18 anos");
        } else {
            System.out.println("Maior de idade");
        }

        String corCamisa = "Preto e Branco";
        String corCamisaDois = "Alvinegro";

        if (corCamisa == "preto e branco" || corCamisa == "Alvinegro") {
            System.out.println("Vasco");
        }

        int ano = 2020;
        if (ano >= 1999 && ano <= 2999) {
            System.out.println("Século 21");
        }

    }
}

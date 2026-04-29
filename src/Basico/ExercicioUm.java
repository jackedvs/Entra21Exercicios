package Basico;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número");
        numero = (teclado.nextInt());

        if(numero >= 0) {
            System.out.println("Numero Positivo");
        } else {
            System.out.println("Numero Negativo");
        }


    }
}

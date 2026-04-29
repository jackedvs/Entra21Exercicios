package Basico;

import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;

        System.out.println("EScreva a sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Sua idade é: " + idade);

        String nome;
        System.out.println("Digite o seu nome: ");
        nome = teclado.next();

        System.out.println("Seu nome é: " + nome + "e sua idade é: " + idade);
    }
}

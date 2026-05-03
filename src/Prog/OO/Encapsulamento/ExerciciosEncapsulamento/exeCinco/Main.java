package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeCinco;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Ford", "Fiesta");

        System.out.println(c1.getMarca());
        System.out.println(c1.getModelo());

        c1.setMarca("honda");
        System.out.println(c1.getMarca());
        c1.setModelo("City");
        System.out.println(c1.getModelo());
    }
}

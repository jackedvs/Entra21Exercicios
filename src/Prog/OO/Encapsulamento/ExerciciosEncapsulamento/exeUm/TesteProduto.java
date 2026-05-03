package Prog.OO.Encapsulamento.ExerciciosEncapsulamento.exeUm;

public class TesteProduto {
    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.setNome("Notebook");
        p1.setPreco(2500);

        p1.aplicarDesconto(10);
        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());



    }
}

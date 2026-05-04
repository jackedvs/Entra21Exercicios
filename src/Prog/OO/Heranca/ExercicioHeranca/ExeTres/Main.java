package Prog.OO.Heranca.ExercicioHeranca.ExeTres;

public class Main {
    public static void main(String [] args) {

        Cachorro c1 = new Cachorro("Peter",52,"shhitzu");

        c1.exibieDados();
        System.out.println(c1.getNome() + " " + c1.getIdade() + " " + c1.getRaca());



    }

}

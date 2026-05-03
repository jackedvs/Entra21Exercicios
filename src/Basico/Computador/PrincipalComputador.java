package Basico.Computador;

public class PrincipalComputador {
   public static void main(String[] args) {
       Computador computador1 = new Computador("intel ", 8 , 214 , 2000);
       Computador computador2 = new Computador("Pentil", 16, 516,5000);

       System.out.println(computador1.exibirEspecificacoes());
       System.out.println(computador1.ehGamer() + "\n");

       System.out.println(computador2.exibirEspecificacoes());
       System.out.println(computador2.ehGamer());


   }
}

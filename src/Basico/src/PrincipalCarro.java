public class PrincipalCarro {
   public static void main(String[] args) {
       Carro carro1 = new Carro("Ford", "Fiesta", 2012, 140);
       Carro carro2 = new Carro("Chevrolet", "Fusion", 2000, 120);
       Carro carro3 = new Carro("Honda", "City",2010,180);

       System.out.println(carro1.exibirDados());
       System.out.println("Idade do carro " + carro1.calcularIdade() + " anos \n");

       System.out.println(carro2.exibirDados());
       System.out.println("Idade do carro " + carro2.calcularIdade() + " anos \n");

       System.out.println(carro3.exibirDados());
       System.out.println("Idade do carro " + carro3.calcularIdade() + " anos ");
    }
}

package Basico.Cachorro;

public class PrincipalCachorro {
   public static void main(String[] args) {
       Cachorro cachorro1 = new Cachorro("Rex" ,"Sitzu" , 10, 10.5);
       Cachorro cachorro2 = new Cachorro("Lala" , "LhazaApso" ,12,17.5);
       Cachorro cachorro3 = new Cachorro("Fox", "Salsicha", 20, 55.6);

       cachorro1.exibirInformacoes();
       cachorro1.classificarTamanho();

       System.out.println(cachorro1.exibirInformacoes());
       System.out.println(cachorro1.classificarTamanho() + "\n");

       System.out.println(cachorro2.exibirInformacoes());
       System.out.println(cachorro2.classificarTamanho() + "\n");

       System.out.println(cachorro3.exibirInformacoes());
       System.out.println(cachorro3.classificarTamanho() + "\n");

   }
}


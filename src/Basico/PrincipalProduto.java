package Basico;

public class PrincipalProduto {
   public static void main(String[] args) {
       Produto produto1 = new Produto("Estojo", 20,7,111222333);
       Produto produto2 = new Produto("lapis", 15,45,66668888);
       Produto produto3 = new Produto("Caderno", 50,40,555999922);

       System.out.println("Produto: " + produto1.nome);
       System.out.println("Disponivel: " + produto1.verificarDisponibilidade());
       System.out.println("Valor em estoque: " + produto1.calcularValorEstoque() + "\n");

       System.out.println("Produto: " + produto2.nome);
       System.out.println("Disponivel: " + produto2.verificarDisponibilidade());
       System.out.println("Valor em estoque: " + produto2.calcularValorEstoque() + "\n");

       System.out.println("Produto: " + produto3.nome);
       System.out.println("Disponivel: " + produto3.verificarDisponibilidade());
       System.out.println("Valor em estoque: " + produto3.calcularValorEstoque() + "\n");




   }
}

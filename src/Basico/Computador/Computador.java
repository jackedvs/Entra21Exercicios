package Basico.Computador;

public class Computador {
    String processador;
    int memoriaRam, armazenamento;
    double preco;

    public Computador(String processador, int memoriaRam, int armazenamento, double preco) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.preco = preco;

    }
    String exibirEspecificacoes(){
        return "Processador " +  processador + " Memoria Ram " +  memoriaRam + " Armazenamento " + armazenamento + " Preço " + preco;
    }
    String ehGamer() {
        if(memoriaRam >= 16  && armazenamento >= 512  ) {
            return "Computador gamer";
        } else {
            return "Computador comum";
        }
    }
}

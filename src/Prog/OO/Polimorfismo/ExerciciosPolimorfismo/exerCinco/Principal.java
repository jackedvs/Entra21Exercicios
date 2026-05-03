package Prog.OO.Polimorfismo.ExerciciosPolimorfismo.exerCinco;

public class Principal {
    public static void main(String[] args) {
        Instrumento instrumento = new Instrumento();
        Instrumento Bateria = new Bateria();
        Instrumento Piano = new Piano();
        Instrumento Violao = new Violao();

        instrumento.tocar();
        Bateria.tocar();
        Piano.tocar();
        Violao.tocar();

    }
}

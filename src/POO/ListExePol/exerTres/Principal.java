package POO.ListExePol.exerTres;

public class Principal {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        Funcionarios Programador = new Programador();
        Funcionarios Designer = new Designer();
        Funcionarios Professor = new Professor();

        funcionario.trabalhar();
        Programador.trabalhar();
        Professor.trabalhar();
        Designer.trabalhar();

    }

    }


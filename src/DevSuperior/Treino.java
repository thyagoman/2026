package DevSuperior;

import java.util.Scanner;

public class Treino implements Apresentar{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacoesAvancadas x = new OperacoesAvancadas(0,0,0);
        OperacoesAvancadas y = new OperacoesAvancadas(0,0,0);
        Treino treino = new Treino();

           treino.BoasVindas();

           System.out.println("Enter the measures of triangulo X");
           x.ladoa = scanner.nextDouble();
           x.ladob = scanner.nextDouble();
           x.ladoc = scanner.nextDouble();
           System.out.println("Enter the measures of triangulo Y");
           y.ladoa = scanner.nextDouble();
           y.ladob = scanner.nextDouble();
           y.ladoc = scanner.nextDouble();

           treino.apresentarResultado(x,y);
     }


    @Override
    public void apresentarResultado(OperacoesAvancadas x, OperacoesAvancadas y) {
        System.out.println("O valor do Triangulo x é ");
        x.calcularArea();
        System.out.println("O valor do Triangulo x é ");
        y.calcularArea();
    }

    @Override
    public void BoasVindas() {
     System.out.println("-----------------------------------");
     System.out.println("Seja bem vindo a guerra matematica");
     System.out.println("-----------------------------------");
    }

    @Override
    public void BoasVindas(String nome) {

    }

    @Override
    public void Finalizado() {
    System.out.println("o Calculo foi finalizado");
    }

    @Override
    public void apresentarResultado() {

    }
}

package Ebac.Exemplos;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        int soma;
        int[] vetor = new int[6];
        int [][] matriz = new int [4][4];
        Scanner scanner = new Scanner(System.in);


        for(int i =0; i < matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++) {
                System.out.println("digite o numero ");
                matriz[i][j] = scanner.nextInt();
                System.out.println(matriz[i]);
            }
        }



    }

    public int somar(int a, int b) {
        return a + b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }
}



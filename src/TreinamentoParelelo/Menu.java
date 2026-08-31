package TreinamentoParelelo;


import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    ;
    public void exibirMenu() {
        Calculo calculo = new Calculo();
        Scanner scanner = new Scanner(System.in);



        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();

        System.out.println("Digite o primeiro número:");
        calculo.setNumero1(scanner.nextInt());
        System.out.println("Digite o segundo número:");
        calculo.setNumero2(scanner.nextInt());

        switch (opcao) {

            case 1:
                System.out.println("O valor da soma é " + calculo.soma());

                break;

            case 2:
                System.out.println("O valor da subtracao é " + calculo.subtracao());
                break;

            case 3:
                System.out.println("O valor da multiplicacao é " + calculo.multiplicar());
                break;

            case 4:
                System.out.println("O valor do calculo é" + calculo.divisao());
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}



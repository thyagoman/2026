package TreinamentoParelelo;

import java.util.Scanner;

public class Main {
   public static void main (String[] args){
       Cadastro cadastro = new Cadastro();
       Cliente cliente = new Cliente();
       Scanner scanner = new Scanner(System.in);
       Menu menu = new Menu();

       menu.exibirMenu();
       System.out.println(" Digite seu Nome para cadastro de emprego ");
       cliente.setNome(scanner.nextLine());

       System.out.println(" Digite seu Sobrenome para cadastro de emprego ");
       cliente.setSobrenome(scanner.nextLine());

       System.out.println(" Digite seu cpf");
       cliente.setCpf(scanner.nextLine());

       System.out.println("Digite seu endereço");
       cliente.setEndereco(scanner.nextLine());

       System.out.println(cliente.toString());




       scanner.close();






   }

}

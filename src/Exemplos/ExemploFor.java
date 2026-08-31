package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploFor {
    public ExemploFor() {
    }

    private String login;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExemploFor exemplo = new ExemploFor();
        int vetor [] = new int[4];

        System.out.println(" Digite seu login ");
        exemplo.setLogin(sc.nextLine());

        if (exemplo.getLogin().equals("Subzero2032")) {
            System.out.println(" Login correto===Seja bem vindo=== ");
        } else{
            System.out.println(" senha errada " + exemplo.getLogin());
        }


    }
}
package Ebac.Exemplos;

import java.util.Scanner;

public class Metodos {
    private String carro;
    private String modelo;
    private String ano;

    public static void main(String[] args){
    Pessoa p = new Pessoa();
    Pessoa p2 = new Pessoa ("tiago","31411813812","11981035618",59);
    Scanner sc = new Scanner(System.in);

    p2.perguntas();
    p2.setNome(sc.nextLine());
    p2.setCpf(sc.nextLine());
    p2.setWhatsapp(sc.nextLine());
    p2.setIdade(sc.nextInt());
    p2.apresentar();

    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void modelo(){
        System.out.println("carro de rally");
    }


    public void setModelo(String modelo, String carro, String ano) {
        this.modelo = modelo;
        this.carro = carro;
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}






package TreinamentoParelelo;

public class Calculo {
public Calculo (){};

// Atributos//
    private int soma;
    private int subtracao;
    private int multiplicar;
    private int divisao;
    private int numero1;

//getters and setter numero 1 e 2//
    public int getNumero1(){
        return numero1;
    }

    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    private int numero2;

// Metodos para operações matematicas //
    public int soma() {
       return numero1 + numero2;
    }

    public int multiplicar () {
        return numero1 * numero2;
    }

    public int subtracao () {
        return numero1 - numero2;
    }

    public int divisao () {
        return numero1 / numero2;
    }

 // texto calculo para print //



}



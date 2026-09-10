package DevSuperior;

import java.util.Scanner;

public class OperacoesBasicas implements Apresentar {
    private double numero1;
    private double numero2;
    private double raiz;
    Scanner scanner = new Scanner(System.in);


// getters//


    public double getRaiz() {
        return raiz;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    //Setters//

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }


    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }


    public double calculoPotencia() {

        System.out.println("Digite um numero");
        setNumero1(scanner.nextDouble());
        System.out.println("Digite um segundo numero");
        setNumero2(scanner.nextDouble());
        try {
            if (getNumero1() <= 0 && getNumero2() < 0) {
                throw new IllegalArgumentException("Zero não é permitido");
            }
        }  catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

        System.out.println("===============Resultado=============");
        double potenciaRetorno = Math.pow(getNumero1(),getNumero2());
        System.out.println(potenciaRetorno);
        return potenciaRetorno;
    }

    public double raizQuadrada() throws Exception {
        System.out.println("Digite um numero para Raiz quadrada");
        setRaiz(scanner.nextDouble());
        try{
            if(getRaiz() <= 0){
                throw new ArithmeticException("erro de calculo não digitar 0");
            }
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("===============Resultado=============");
        double raizRetorno = Math.sqrt(getRaiz());
        System.out.println(raizRetorno);
        return raizRetorno;
    }

    @Override
    public void apresentarResultado() {
        System.out.println(" Raiz quadrada " + Math.sqrt(getRaiz()));
        System.out.printf(" Potencia é %s%n", Math.pow(getNumero1(), getNumero2()));
        System.out.println(" Valor 1 digitado " + getNumero1());
        System.out.println(" Valor 2 digitado " + getNumero2());
        System.out.println(" Raiz digitada " + getRaiz());
    }

    @Override
    public void BoasVindas() {
        System.out.println("----------------------------------- ");
        System.out.println(" =========Seja bem vindo ========== ");
        System.out.println("----------------------------------- ");
    }

    @Override
    public void BoasVindas(String nome) {
        System.out.println("----------------------------------- ");
        System.out.println(" =========Bom DIA========== ");
        System.out.println("----------------------------------- ");
    }


    @Override
    public void Finalizado() {
        System.out.println("----------------------------------- ");
        System.out.println(" =========Finalizado========== ");
        System.out.println("----------------------------------- ");
    }

    @Override
    public void apresentarResultado(OperacoesAvancadas x, OperacoesAvancadas y) {

    }
}


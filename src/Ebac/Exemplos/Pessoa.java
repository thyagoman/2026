package Ebac.Exemplos;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;


    private String whatsapp;

    public Pessoa (){
        this.cpf = "";
        this.idade = 0;
        this.nome = "";
        this.whatsapp = "";
    }

    public Pessoa (String nome, String cpf,String whatsapp,int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.whatsapp = whatsapp;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome =nome;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void apresentar(){
        System.out.println("seu nome é " + getNome());
        System.out.println("seu cpf é " + getCpf());
        System.out.println("seu whats app é " + getWhatsapp());
        System.out.println("Sua idade é " + getIdade());
        System.out.println("Obrigado volte sempre");
    }

    public void perguntas(){
        System.out.println("=================== SEJA BEM VINDO ====================== ");
        System.out.println(" Digite os valores abaixo ");
    }

}

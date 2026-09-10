package DevSuperior;

import java.util.Scanner;

public class Alunos {

    private String nome;
    private String cpf;
    private int idade;
    Scanner scanner = new Scanner(System.in);

    public Alunos(){}
    //-----------------------------getters and setters---------------------------------------//


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    //-------------------------------------------Exceções--------------------------//

    public void CadastroAluno () {
        System.out.println("Bom dia, Insira o nome do Aluno");
        setNome(scanner.nextLine());
        System.out.println("Bom dia, Insira o cpf do Aluno");
        setCpf(scanner.nextLine());
        try {
            for (int i = 0; i < getNome().length(); i++) {
                if (Character.isDigit(getNome().charAt(i))) {
                    throw new IllegalArgumentException("não é permitido numeros no Nome");
                }
            }
            if (getNome().isEmpty()) {
                throw new NullPointerException("Nome vazio");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Programa fechado");
            System.exit(1);
        }
        try {

            if (getCpf().isEmpty()) {
                throw new NullPointerException("Cpf vazio");
            }
            for (int i = 0; i < getCpf().length(); i++) {
                if (Character.isLetter(getCpf().charAt(i))) {
                    throw new IllegalArgumentException("não é permitido letras no CPF");
                }
            }

        } catch (NullPointerException  | IllegalArgumentException f) {
            System.out.println(f.getMessage());
            System.out.println("Programa fechado");
            System.exit(1);

        }
}}
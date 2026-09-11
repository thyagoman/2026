package DevSuperior;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadastro {
   Alunos aluno = new Alunos();
    Scanner scanner = new Scanner(System.in);

    public void cadastrarAluno(){
        Alunos aluno = new Alunos();
        cadastroNome();
        cadastroCPF();
        cadastroIdade();
    }

    public void cadastroNome () {
        while(true){
            try {
                System.out.println("Bom dia, Insira o nome do Aluno");
                aluno.setNome(scanner.nextLine());
                for (int i = 0; i < aluno.getNome().length(); i++) {
                    if (Character.isDigit(aluno.getNome().charAt(i))) {
                        throw new IllegalArgumentException();
                    }
                }
                if (aluno.getNome().isEmpty()) {
                    throw new NullPointerException();
                }break;
            } catch (IllegalArgumentException e) {
            }
        }
    }



    public void cadastroCPF(){
        while (true){
            try {
                System.out.println("Bom dia, Insira o cpf do Aluno");
                aluno.setCpf(scanner.nextLine());
                if (aluno.getCpf().isEmpty()) {
                    throw new NullPointerException("Cpf vazio");
                }
                for (int i = 0; i < aluno.getCpf().length(); i++) {
                    if (Character.isLetter(aluno.getCpf().charAt(i))) {
                        throw new IllegalArgumentException("não é permitido letras no CPF");
                    }
                }
                break;
            } catch (NullPointerException  | IllegalArgumentException f) {
                System.out.println(f.getMessage());
                System.out.println("Programa fechado");

            }
        }}

    public void cadastroIdade(){
        while (true){
            try{
                System.out.println("Digite sua idade");
                aluno.setIdade(scanner.nextInt());
                if(aluno.getIdade() < 0 || aluno.getIdade() > 130){
                    throw new IllegalArgumentException("Idade não permitida");
                }break;
            }catch ( IllegalArgumentException e){
                System.out.println(e.getMessage());
            }catch (InputMismatchException e){
                System.out.println("Não pode letra bb");
                scanner.nextLine();
            }

        }
        System.out.println("Cadastro Realizado");
    }
}


package DevSuperior;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Registro {
    Scanner scanner = new Scanner(System.in);
    List<Alunos> listaAlunos = new ArrayList<Alunos>();
    List<Turmas> listaTurmas = new ArrayList<Turmas>();

    public void cadastrarTurma(){
        Turmas turma = new Turmas();
        cadastrarTurma(turma);
        cadastrarSala(turma);
        cadastrarTurno(turma);
        listaTurmas.add(turma);
        System.out.println(listaTurmas.getFirst());
        System.out.println(listaTurmas.getLast());

    }
    //--------- Arquitetura para cadastrar alunos com tratamento de exceções ------//

   public void cadastrarAluno(){
        Alunos aluno = new Alunos();
        cadastroNome(aluno);
        cadastroCPF(aluno);
        cadastroIdade(aluno);
        listaAlunos.add(aluno);
    }
    public void cadastroNome (Alunos aluno) {
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
                    throw new NullPointerException("nome vazio");
                }break;
            } catch (NullPointerException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            scanner.nextLine();
        }
    }

    public void cadastroCPF(Alunos aluno){
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
            scanner.nextLine();
        }
    }

    public void cadastroIdade(Alunos aluno){
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

    public void apresentarLista() {
        for (Alunos aluno : listaAlunos) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getIdade());
            System.out.println(aluno.getCpf());
            System.out.println("=====================================================");
      }
    }

    //--------- Arquitetura para cadastrar alunos com tratamento de exceções ------//

    public void cadastrarTurma(Turmas turmas){
        while(true){
        try{
            System.out.println("Digite o nome da turma");
            turmas.setNomeDaTurma(scanner.nextLine());
           for(int i = 0;i < turmas.getNomeDaTurma().length();i++ ){
               if (Character.isDigit(turmas.getNomeDaTurma().charAt(i))){
                   throw new IllegalArgumentException("Você errou digitou numero");
                }}
           if(turmas.getNomeDaTurma().isEmpty()){
               throw new NullPointerException("preencha com o nome da Turma");
           }
        break;
        }catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e.getMessage());
      }
    }
   }
   public void cadastrarSala(Turmas turmas){
        while(true) {
            try {
                System.out.println("Digite a sala para cadastro");
                turmas.setSala(scanner.nextLine());
                if (turmas.getSala().isEmpty()) {
                    throw new NullPointerException("Você deve digitar uma sala");
                }break;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
            scanner.nextLine();
        }
   }

   public void cadastrarTurno(Turmas turmas){
        while(true) {
            try {
                System.out.println("Digite o turno, manha , tarde ou noite");
                turmas.setTurno(scanner.nextLine());
                for (int i = 0; i < turmas.getTurno().length(); i++)
                    if (Character.isDigit(turmas.getTurno().charAt(i))) {
                        throw new IllegalArgumentException(" digite o turno manha, tarde ou noite");
                    }

                if (turmas.getTurno().isEmpty()) {
                    throw new NullPointerException("Não pode deixar o campo em branco");
                }
            break;
            } catch (IllegalArgumentException | NullPointerException e) {
                System.out.println("Voce digitou algo invalido " + e.getMessage());
            } finally {
                System.out.println("Obrigado ótimo dia");
            }

        }
       scanner.nextLine();
   }
}




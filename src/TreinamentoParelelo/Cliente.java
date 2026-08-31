package TreinamentoParelelo;

public class Cliente extends Cadastro{
    private String cpf;


    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "O cliente é " + super.getNome() +
                "\nO seu sobrenome é " + super.getSobrenome() +
                "\nO seu cpf é " + cpf+
                "\nO seu endereço é " + super.getEndereco();
    }

}

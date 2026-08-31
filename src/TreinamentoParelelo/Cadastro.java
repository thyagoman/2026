package TreinamentoParelelo;

public class Cadastro {

    private String nome;
    private String sobrenome;
    private String endereco;
    private String texto;


    public String getNome(){
    return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome(){
      return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getTexto(){
        return "========================= Seja bem Vindo ============================";

    }

    public String getEndereco(){
     return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }


}

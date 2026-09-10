package Ebac.Naruto;

public class Personagens implements Comparable <Personagens> {
    private String nome;
    private String vila;
    private String nivel;
    private int    idade;

    public  Personagens(String nome,String vila,String nivel,int idade){
       this.vila = vila;
       this.idade = idade;
       this.nivel = nivel;
       this.nome = nome;
    }

    public void Apresentar (){
        System.out.println("O nome dele é " + nome);
        System.out.println("A idade dele é " + idade);
        System.out.println("O nivel é " + nivel);
        System.out.println("ele é da vilda da " + vila);
    }

    @Override
    public int compareTo(Personagens outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome + " | " + vila + " | " + nivel + " | " + idade;
    }
}














//Rank E: Nível básico ensinado na Academia Ninja (técnicas introdutórias).
// Rank D: Nível para Genin (técnicas de combate simples e utilitárias).
// Rank C: Nível para Chunin (técnicas intermediárias que exigem maior controle de chakra).
// Rank B: Nível para Jonin (técnicas avançadas e de alto risco).
// Rank A: Nível de elite/especialista (técnicas altamente perigosas, como o Rasengan original).Rank S: Nível
// supremo ou proibido (técnicas únicas, destrutivas ou místicas de nível lendário, como o Edo Tensei).
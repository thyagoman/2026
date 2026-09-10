package Ebac.Excecao;

public class Teste {
    int tiago;

    public static void main(String[] args) throws Exception {
    String mensagem;
    TesteNullVazio();

    }
    public static void TesteThrow1() throws Exception {
        try {
            int tiago = 10 / 0;
        } catch (Exception e) {
            int tiago = 10 * 10;
            System.out.println("Erro" + e.getMessage() + "Variavel tiago recebeu o valor de " + tiago);
            String mensagem = e.getMessage() + "causa do erro " + e.getCause();
        } finally {
            System.out.println("Fça isso entao");
        }
    }
// NÃO É PERMITIDO UMA CLASSE FILHA ARITHMETICH ESTAR DEPOIS DA CLASE PAI, POIS ESTA JA TRATARA O ERRO
    public static void TesteThrow2(){
        try {
            System.out.println("A");
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("D");
        } finally {
            System.out.println("E");
        }
    }
    public static void TesteNullVazio() {
        String comTexto = "abc";
        String vazia = "";
        String nula = null;

        System.out.println("Tamanho comTexto: " + comTexto.length());
        System.out.println("Tamanho vazia: " + vazia.length());

        try {
            System.out.println("Tamanho nula: " + nula.length());
        } catch (NullPointerException e) {
            System.out.println("Deu erro: a variavel 'nula' nao aponta pra nenhum objeto");
        }
    }

}

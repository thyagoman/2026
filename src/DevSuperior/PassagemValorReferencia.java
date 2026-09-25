package DevSuperior;

public class PassagemValorReferencia {

        public static void main(String[] args) {
            
            int x = 10; // Nossa nota original na gaveta

            System.out.println("Antes do método: " + x); // Imprime 10

            mudarNumero(x); // Passamos apenas uma cópia de x

            System.out.println("Depois do método: " + x); // Continua sendo 10!
        }

        public static void mudarNumero(int x) {
             ; // Altera apenas a cópia lá dentro
            System.out.println("Dentro do método: " + x); // Imprime 20
        }
    }


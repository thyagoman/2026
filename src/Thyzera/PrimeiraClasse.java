package Thyzera;

public class PrimeiraClasse{

    public static void main(String [] args){

        Produto produto = new Produto("Livro de estudo",500);
        Cliente cliente = new Cliente("Tiago aparecido","31411813812");


        System.out.println(produto.descricao + " este é o produto o seu valor é R$ " + produto.preco);
        System.out.println(cliente.nome + " é o nome do cliente ");
        System.out.println(cliente.cpf + " este é o seu cpf ");
    }
}


package Thyzera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
    public String nome;
    public String cpf;

    public Cliente (String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public static void ListDeClients(){

        List<String> Lista = new ArrayList<>();
        Lista.add("Tiago aparecido Pereira");
        Lista.add("Tiago aparecido Ferrara");
        Lista.add("Tiago aparecido Junkeira");
        Lista.add("Antonio aparecido pereira");
        Lista.add("Bia Natasha lovely");
        Collections.sort(Lista);
        System.out.println(Lista);
    }
    public static void NumerosDePlaca(){}

}

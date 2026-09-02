package Naruto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){



        Personagens personagem = new Personagens("naruto","Folha","genin",15);
        personagem.Apresentar();
        System.out.println("=====================================================================");
        Personagens personagem2 =new Personagens("gaara","areia","genin",16);
        personagem2.Apresentar();
        System.out.println("=====================================================================");
        Personagens personagem3 = new Personagens("Madara","Inferno","Hokage",100);
        personagem3.Apresentar();
        System.out.println("=====================================================================");


        List<Personagens> ListaPersonagem = new ArrayList<>();
        ListaPersonagem.add(personagem);
        ListaPersonagem.add(personagem2);
        ListaPersonagem.add(personagem3);
        Collections.sort(ListaPersonagem);
        System.out.println(ListaPersonagem);


    }
}

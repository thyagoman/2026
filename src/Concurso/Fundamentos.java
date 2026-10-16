package Concurso;

import java.util.Scanner;

public class Fundamentos {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
//===============LOGICAS BOLEANAS =================
// ====Parenteses sempre vem primeiro , depois Negação , Depois And ULTIMO OR===

        int c = 5;
        int b = 8;
        int d = 3;

       boolean x = (c<b) || (b<d) && (c<d);
       boolean y = (c<b) || (b<d) && (c<d);


       System.out.println(x);
       System.out.println(y);
//===============================BITWISE=========================================
// ***********************************************
// BITWISE EM JAVA
// ***********************************************

        int bits = 10;  // 1010
        int bits2 = 7;  // 0111


// OR (|)
// Retorna 1 quando pelo menos um dos bits é 1.
//
// 1010
// 0111
// ----
// 1111 = 15
        int bitsOR = bits | bits2;
        System.out.println("OR: " + bitsOR);


// AND (&)
// Retorna 1 somente quando ambos os bits são 1.
//
// 1010
// 0111
// ----
// 0010 = 2
        int bitsAND = bits & bits2;
        System.out.println("AND: " + bitsAND);


// XOR (^)
// Retorna 1 quando os bits são diferentes.
//
// 1010
// 0111
// ----
// 1101 = 13
        int bitsExclusive = bits ^ bits2;
        System.out.println("XOR: " + bitsExclusive);


// NOT (~)
// Inverte todos os bits.
//
// 00001010  (10)
// 11110101
//
// Em Java o resultado é -11
// devido ao complemento de dois.
        int bitsNot = ~bits;
        System.out.println("NOT: " + bitsNot);


// SHIFT PARA ESQUERDA (<<)
// Move os bits para a esquerda.
//
// 1010 (10)
// 10100 (20)
//
// Equivale a multiplicar por 2.
        int leftShift = bits << 1;
        System.out.println("LEFT SHIFT: " + leftShift);


// SHIFT PARA DIREITA (>>)
// Move os bits para a direita.
//
// 1010 (10)
// 0101 (5)
//
// Equivale a dividir por 2.
        int rightShift = bits >> 1;
        System.out.println("RIGHT SHIFT: " + rightShift);

       final int A = 50;
        while (A>0){
          //  A -= 5; JAVA NÃO permite utilizar constante no escopo local, ja é diferente de php
           System.out.println(A);

        }


    }
}

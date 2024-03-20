package br.unicap.progImp.exercicio01;

import java.util.Scanner;

//Escrever uma função public static boolean decide(int n) que lê 5 valores para "n", um de cada vez, e conta quantos destes são negativos, escrevendo esta informação ao fim do programa.

public class Question02 {

	public static boolean decide(int n){
        Scanner s = new Scanner (System.in);
            System.out.prinln("Digite um valor:");
                n = s.nextDouble();

                if (n < 0){} else (n > 0) {} 
        System.out.prinln("Foram digitados" + n + "números negativos.");
    }

}
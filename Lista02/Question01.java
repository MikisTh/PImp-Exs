package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question01 {

	public static void main(int x, int n) {
		Scanner s = new Scanner(System.in);
        int [] vetor = new int [n];
        System.out.println("Digite a quantidade de números: ");
            n = s.nextInt();
        System.out.println("Digite os números: ");
        System.out.println("Digite o número a ser procurado: ");
            x = s.nextInt();
        
            
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = s.nextInt();
    }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                System.out.print(i + " ");
        }
    }
        if (vetor[n]!= x) {
            System.out.println("-1");
    }

}
}


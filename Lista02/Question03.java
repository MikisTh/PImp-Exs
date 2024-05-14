package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question03 {

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = s.nextInt();
        }
        
        int numero = s.nextInt();
        int inicio = 0;
        int fim = n - 1;
        int meio = (inicio + fim) / 2;
        int passos = 0;

        while (inicio <= fim) {
            if (vetor[meio] == numero) {
                System.out.println(meio);
                break;
            } else if (vetor[meio] > numero) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
            meio = (inicio + fim) / 2;
            passos++;
        }
        System.out.println(passos);
        s.close();






        
    }
}
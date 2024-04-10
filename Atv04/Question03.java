//Crie um programa que leia uma matriz 10x10.
//Após a leitura da matriz, imprima toda a matriz e escreva o maior número da linha 5 e o maior número da coluna 7 (considerando que linhas e colunas comecem no 0).

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int maior = matriz[0][0];
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("O número maior é: " + maior);
        System.out.println("A linha é: " + linha);
        System.out.println("A coluna é: " + coluna);
        s.close();
        System.out.println("FIM");
        System.exit(0);
    }
}

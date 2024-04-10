//Crie um programa, em java, que lê um número N e imprima um matriz NxN na qual os valores dos elementos é igual ao produto das respectivas posições (linha i x coluna j)

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int matriz[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = i * j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        s.close();
    }
}


        
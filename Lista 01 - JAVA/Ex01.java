//Gere matriz 4 x 4 com valores no intervalo [1, 20].
//Escreva um programa que transforme a matriz gerada numa matriz triangular inferior, ou seja, atribuindo zero a todos os elementos acima da diagonal principal. 
//Imprima a matriz original e a matriz transformada.

import java.util.Scanner;

public class MatrizTriangularInferior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 20) + 1;
            }
        }
        System.out.println("Matriz original: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();            
        }
        System.out.println("Matriz transformada: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > j) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
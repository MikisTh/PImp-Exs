package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question04 {

    public static String buscarTitulo(String [] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int c = s.nextInt();

        String[][] matriz = new String[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = s.next();
            }
        }
        String busca = s.next();
        int inicio = 0;
        int fim = matriz.length - 1;
        int meio = (inicio + fim) / 2;
        
        while (inicio <= fim) {
            if (matriz[meio][0].equals(busca)) {
                System.out.println(matriz[meio][1]);
                break;
            } else if (matriz[meio][0].compareTo(busca) > 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
            meio = (inicio + fim) / 2;
        }
        if (inicio > fim) {
            System.out.println("Nao encontrado");
        }
        s.close();
        
    }
}
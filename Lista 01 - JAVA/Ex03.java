//O professor de uma faculdade finalizou precisa computar as faltas dos seus alunos durante o semestre. Como ele dá aula em várias turmas, ele criou um programa para facilitar essa atividade. O programa recebe a quantidade de alunos de uma turma, o nome de todos os alunos e todas as faltas e presenças ao longo do semestre (composto por 30 dias de aula). Com isso, ele consegue computar os alunos que irão reprovar por falta, caso o número de faltas seja superior a 10.

import java.util.Scanner;

public class Faltas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int alunos = scanner.nextInt();
        String[] nomes = new String[alunos];
        int[] faltas = new int[alunos];
        int[] presencas = new int[alunos];
        for (int i = 0; i < alunos; i++) {
            nomes[i] = scanner.next();
            faltas[i] = scanner.nextInt();
            presencas[i] = scanner.nextInt();
        }
        for (int i = 0; i < alunos; i++) {
            if (faltas[i] > 10) {
                System.out.println(nomes[i]);
            }
        }
    }
}
//Construa um algoritmo para gerenciar a venda de ingressos (ocupação) das poltronas numeradas de um teatro, que tem 200 lugares, organizados em 10 fileiras com 10 cadeiras cada fila. Inicialize a matriz com todas as posições valendo -1 indicando que elas estão vazias. Para cada nova venda de ingresso, deve se solicitar ao usuário o número da fila e o número da poltrona. Se a poltrona estiver “vazia”, deve-se alterar seu conteúdo para o valor 1, indicando que o ingresso foi vendido. Se não estiver vazia, deve-se emitir uma mensagem: “Poltrona ja foi vendida”.
import java.util.Scanner;

public class VendaIngressos {

    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        int[][] poltronas = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                poltronas[i][j] = -1;
            }
        }
        int vendas = 0;
        while (vendas < 200) {
            int linha = scanner.nextInt();
            int poltrona = scanner.nextInt();
            if (poltronas[linha][poltrona] == -1) {
                poltronas[linha][poltrona] = 1;
                vendas++;
            } else {
                System.out.println("Poltrona ja foi vendida");
            }
        }
    }
}
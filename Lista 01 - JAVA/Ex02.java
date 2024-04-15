//Crie em Java uma matriz 3x3 de inteiros, preencha a matriz e verifique se a matriz é um quadrado mágico. Diz-se que uma matriz é um quadrado mágico quando a soma de todas as suas linhas, todas as suas colunas, sua diagonal principal e sua diagonal secundária resultam no mesmo valor. Exemplo abaixo.
public class QuadradoMagico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 20) + 1;
            }
        }
        System.out.println("Matriz original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz quadrado magico: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    public static int somaLinha(int[] linha) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += linha[i];
    }
    return soma;
}
    public static int somaColuna(int[] coluna) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += coluna[i]; 
    } 
    return soma;
}
    public static int somaDiagPrincipal(int [][] mat) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += mat[i][i];
    }
    return soma;   
}
    public static int somaDiagSecundaria(int [][] mat) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += mat[i][2-i];        
    }
    return soma;      
}

}
}

public class matrixNotSquared {
    public static void main (String[] args){ 
    int[][] mat = {
        {1,2,3,10,20},
        {4,5,6,11,30},
        {7,8,9,12,40}
    };

    for (int i = 0; i < mat.length; i++) { //Percorre Linhas (mat.length = tamanho total de linhas)
        for (int j = 0; j < mat[0].length; j++) { // Percorre Colunas (mat[0].length = tamanho total de colunas)
            System.out.println(mat[i][j]+"");

// for (int i = 0; i < mat.length; i++) { //Percorre Linhas (mat.length = tamanho total de linhas)
//   for (int j = 0; j < mat.length; j++) { // Percorre Colunas
//     System.out.println(mat[i][j]+"");

//  for (int i = 0; i < 3; i++) { //Percorre Linhas
//     for (int j = 0; j <3; j++) { // Percorre Colunas

        }
    }
}
}
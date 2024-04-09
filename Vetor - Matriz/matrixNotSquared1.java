
public class matrixNotSquared {
//como preencher o vetor/matriz?
//como ler o vetor/matriz?
    public static void main (String[] args){ 
    int[][] mat = {
        {1,2,3,10,20},
        {4,5,6,11,30,100},
        {7,8,9,12,40}
    };

    for (int i = 0; i < mat.length; i++) { 
        for (int j = 0; j < mat[1].length; j++) { // "mat[i].length" esse método funciona em qualquer função quadrada ou não-quadrada
            System.out.println(mat[i][j]+"");

        }
    }
}

}  
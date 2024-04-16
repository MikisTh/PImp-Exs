public class MatrixTransposta1 {

    public static void main (String[]args) {
        int [][] A = {
            {1,2,3},
            {4,5,6},            
        };

        int [][] B = new int [3][2];

        for (int i=0; i < A.length; i++){
            for( int j = 0; j < A[i].length; j++) {
                B[i][j] = A[j][i];
            }
        }
    }
}
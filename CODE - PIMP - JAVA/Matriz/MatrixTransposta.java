public class MatrixTransposta {

    public static void main (String[]args) {
        int [][] A = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int [][] B = new int [3][3];

        for (int i=0; i<B.length; i++){
            for( int j = 0; j < B[i].length; j++) {
                B[i][j] = A[j][i];
            }
        }
    }
}
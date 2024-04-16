public class MatrixSoma1 {
      
    public static void main (String[]args) {
        int [][] A = {
            {1,2},
            {4,5},            
        };

        int [][] B = {
            {2,4},
            {5,6},  
        };

        int [][] C = new int [2][2];

         C = somaMatrix(A, B);

        for (int i=0; i < C.length; i++){
            for( int j = 0; j < C[i].length; j++) {
                C[i][j] = A[j][i] + B[i][j];
            }
        }
        for (int i=0; i < C.length; i++){
            for( int j = 0; j < C[i].length; j++) {
                System.out.print(C[j][i] +"");
            }
        }
    }
}
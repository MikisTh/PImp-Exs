package Vetor - Matriz;
public class array5 {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;

        int [] v2 = new int [n]; //Dinâmico
            for (int i = 0; i < 5; i++){
            v2[i] = 2*i;
        }

            for(i = 0; i < n; i++){
            System.out.println("Posicao: " + i + " Valor:" + v2[i]);
    }
}
}
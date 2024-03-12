public class Recursao {

    public static double fat (int n){
       // System.ou.println("Calculado fat de" +n);
        if (n==1) {
           //System.out.println("caso Base!!");
            return 1;
        }
        double resultado = n * fat(n-1);
        //System.out.println("Voltei fat de" +n);
        return resultado;
    }
}

public static void main (String[] args){
    int n = 100;
    System.out.println();

} 
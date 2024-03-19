import java.util.Scanner;

public class exercFunc {
    public static int afim (int a, int b, int x) {
         return a * x + b;
    }
    public static voi main (String[]args)   {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextint();
        int variavel = s.nextint();

        int resultado = afim(n1, n2, variavel);
        System.out.println("O resultado eh:"+ resultado);
    }  
    }

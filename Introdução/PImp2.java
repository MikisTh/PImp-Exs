import java.util.Scanner;

public class exercFunc {
    public static int eq2g (int a, int b, int c, int x) {
         return ((a * (x * 2) + b * x) + c);
    }
    
    public static voi main (String[]args)   {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextint();
        int c = s.nextint();
        int x = s.nextint();

        int resultado = eqg2(a, b, c, x);
        System.out.println("O resultado eh:"+ eq2g(a, b, c, x));
    }  
    }

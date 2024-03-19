import java.util.Scanner;

public class exercFunc {
    public static double eq2g (int a, int b, int c, int x) {
         return a * math.pow(x,2)* x + b * x + c;
    }
    
    public static void main (String[]args)   {
        Scanner s = new Scanner(System.in);
        System.out.println("O valor de a eh?");
        int a = s.nextInt();
         System.out.println("O valor de b eh?");
        int b = s.nextint();
         System.out.println("O valor de c eh?");
        int c = s.nextint();
         System.out.println("O valor de x eh?");
        int x = s.nextint();

        int resultado = eqg2(a, b, c, x);
        System.out.println("O resultado eh:"+ eq2g(a, b, c, x));
    }  
    }

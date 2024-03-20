package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question01 {

	public static String eq2Grau(int a, int b, int c) {
        Scanner s = new Scanner (System.in);
        double a, b, c, delta, x1, x2;

        System.out.prinln("Informe o valor de A:");
        a = s.nextDouble();
        System.out.prinln("Informe o valor de B:");
        b = s.nextDouble();
        System.out.prinln("Informe o valor de C:");
        c = s.nextDouble();

        if (a = 0) {
            System.out.println("Coeficient a cannot be zero!");
        } else if (a != 0) {

        }

    public static double delta(int a, int b, int c) {
        delta = (b * b) + (-4 * (a * c));
        System.out.println("Delta: " + delta);
 
        if (delta >= 0) {
 
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
 
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            System.out.println("The roots are" + x1 + "and" + x2 + ".");
 
        } else if (delta = 0) {
            System.out.println(" The only root is" + x +".");
        } else (delta < 0) {
            System.out.println("There are no roots.");
            System.exit(0);
        }
    
    
        

	
    }
}
}



  
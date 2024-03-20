package br.unicap.progImp.exercicio01;

import java.util.Scanner;

// Implemente um método recursivo que receba como entrada dois números inteiros x e k e retorne o valor da operação xk. 
// Não utilize o método Math.pow() do Java. Utilize apenas multiplicação.
public class Question04 {

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        int x, k;

        System.out.prinln("Informe o valor de X:");
        x = s.nextDouble();
        System.out.prinln("Informe o valor de K:");
        k = s.nextDouble();


    public class Recursao {
        public static int multi (int x, k) {
            if (x * k)
                return x^k();
            return multi();
    }

}

}

}
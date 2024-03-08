package br.unicap.progImp.exercicio01;
import java.util.Scanner;

public class Question02 {

		public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

			System.out.print("Entre com o número para gerar a tabuada: ");
			int n = scan.nextInt();

			System.out.println("Tabuada de " + n + ":");

			for (int i=1; i<=10; i++){
				System.out.println(n + " x " + i + " = " + (n*i));
		}
	}
	
}


package br.unicap.progImp.exercicio01;
import java.util.Scanner;

public class Question01 {

	public static double afim (int a, int b){
		return -b/a;
}
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println(afim(a,b));
		      
		
	}
}
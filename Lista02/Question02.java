package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String[] livros = new String[5];

        livros[5] = "Meu Titulo";

        System.out.println("Digite o titulo do livro: ");
        String titulo = s.nextLine();
        String resposta = "Livro nao encontrado!";
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].equalsIgnoreCase(titulo)) {
                resposta = livros[i];
            }
        }
        System.out.println(resposta);
        s.close();
        






	}

}
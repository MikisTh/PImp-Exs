package br.unicap.progImp.exercicio01;
import java.util.Scanner;

public class Question03 {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        double hp, lp, ha, la, qtd;

        hp = 2.6;
        lp = 1.6;
        ha = 0.35;
        la = 0.3;
        
        areaParede(hp, lp)
        areaAzulejo(ha, la)
        qtd = (hp * lp) / (ha * la);

        System.out.println("Quantidade de azulejos necessários para cobrir a parede: " + qtd);     
    }
}
    
import java.util.Scanner;

public class vetor {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int [] elementos = new int [10];            
        int [] inverso = new int [10]; 
//increment "i"
        for (int i=0; i<10; i++) {
            elementos[i] = scanner.nextInt();
        }
//decrement "i"   
         
        for (int i=9; i>=0; i--) {
            inverso[i] = elementos[10 - i - 1]; // [9-i]
        
        for (int i=9; i>=0; i--) {
            inverso[i] = elementos[elementos.length - i - 1]; 


            //inverso[9] = elementos[0];
        }
        for (int i=0; i<10; i++) {
            System.out.println(elementos[i]+"");  

        
    }

}

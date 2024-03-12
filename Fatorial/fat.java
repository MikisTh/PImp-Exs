public class fat {

public static int fat(int n){
int cont = 1;

for(int i=n; i>=1; i--){
    cont = cont*i;
}
}
return cont;
}
// soma=val + soma

//import java.util.Scanner;

//public class Exercicio03 {

    //public static void main(String[] args){
    
        //Scanner ent = new Scanner(System.in);
       // int num, fat = 1;
        //int cont = 1;

        //do{
           // System.out.println("Digite um nº");
           // num = ent.nextInt();
            
           // for(int i = 1;i <= num; i++){
           //      fat = fat * i;
           // }
            
           // System.out.println("!" + num + " = " + fat);
           // cont++;
            
     //  }while(cont < 2);
    //}
//}

public static int fat (int n) {
    if(n==1){
        return 1;
    }
    return n* fat(n-1);
    }

//5!
//(5*4!)=20
//(4*3!)=60
//(3*2!)=120
//(2*1!)=120

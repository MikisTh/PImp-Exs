
public class Recursao {
        public static int somaN(int n) {
        if (n == 1)
            return 1;
        return n + somaN(n-1);
}
        public static double somaN1(int n1) {
        if (n1 == 1)
            return 1;
        return 1.0/n1 + somaN(n-1);
}
public class somaN {
        public static void somaN2( int n2){
        if (n2==1)
            return 1;
        return n + somaN2(n-1);
}
public class fibonacci {
        public static int fib (int n){
        if(n==1)
            return 0;
        else if (n==2)
            return 1;
         else 
            return fib(n-1) + fib(n-2);
        }
        public static int fibo (int n){
        if(n==1)
            return 0;
        else if (n==2)
            return 1;
         else 
            return fib(n-1) + fib(n-2);
        }

        public static void main (String[]args){
            Scanner s = new scanner (System.in);
            int n = s.nextInt();
            long startTime = System.currentTimeMillis();
            System.out.printLn(fib());
            long endTime =System.currentTimeMillis();
            long duration = (endTime = startTime);
            System.out.println(duration);

        } 
}
}
}
// n + somaN (n-1)
//posição? = valor?
//3+somaN(2)= 3+2 = 5
//2+soma(1) = 2+1 =3
//backstate-backtrack:volta de estados
//cash:mudança de tipo da variável
//somaN(3)
// 1/3 + somaN(2)
// 1/2 + somaN(1)
//         1
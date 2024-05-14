public class BubbleSort  {
    public static void BubbleSort (String[]args) {
        int n = args.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (args[j - 1].compareTo(args[j]) > 0) {
                    String temp = args[j - 1];
                    args[j - 1] = args[j];
                    args[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(args[i]);
        }
    }
}
public class SelectionSort  {
    public static void SelectionSort (String[]args) {
        int n = args.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (args[j].compareTo(args[min]) < 0) {
                    min = j;
                }
            }
            String temp = args[i];
            args[i] = args[min];
            args[min] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
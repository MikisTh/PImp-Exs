public class InsertionSort  {
    public static void InsertionSort (String[]args) {
        String[] arr = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = args[i];
        }
        for (int i = 1; i < arr.length; i++) {
            String temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(temp) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class InsertionSort  {
    public static void InsertionSort (String[]args) {
        int [] vetor = new int [10];
//Preenchimento do vetor utilizando números aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        System.out.println("Desordenado");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }

//InsertionSort
//Ordenação
        int aux, j;
            for(int i = 1; i < vetor.length; i++) {
                aux = vetor[i];
                j = i - 1;
                while (j >= 0 && vetor[j] > aux) {
                    vetor[j + 1] = vetor[j];
                    j--;
                    //j = j - 1;
                }
                vetor[j+1] = aux;
            }
//Imprime o vetor
            System.out.println("\n\n Ordenado");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }

    }
}
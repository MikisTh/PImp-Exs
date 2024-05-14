public class SelectionSort  {
    public static void SelectionSort (String[]args) {
        int [] vetor = new int [10];

        for( i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        System.out.println("Vetor Desordenado");
            for( i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }
                //SelectionSort = Algoritmo de complexidade quadrática "n^2"
        int menor;
        for( i = 0; i < vetor.length; i++) {
            menor = i;
            for(j = i+l; j < vetor.length; j++){
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            aux = vetor[menor]
            vetor[menor] = vetor[i];
            vetor[i] = aux;
        }
        System.out.println("\n\n Vetor Ordenado");
            for( i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);

    }
}
}
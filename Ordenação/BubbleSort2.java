public class BubbleSort  {
    public static void BubbleSort (String[]args) {

//Preenchimento do vetor utilizando números aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

//Imprime o vetor desordenado
        System.out.println("Vetor Desordenado");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }
//BubbleSort

        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for(int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
        }
    }
}
//Imprime o vetor desordenado
        System.out.println("\n \n Vetor Ordenado");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
}
        //for (int i = 0; i < vetor.length; i++) {
            //for (int j = 0; j < vetor.length - 1; j++) {
                //if (vetor[j] > vetor[j + 1]) {
                    //aux = vetor[j];
                    //vetor[j] = vetor[j + 1];
                    //vetor[j + 1] = aux;
                //}
            //}
       //}


    }
}
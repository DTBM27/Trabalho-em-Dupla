public class SelectionSort {
    public static Resultado sort(int[] vetor) {
        int trocas = 0;
        int posicao_menor, aux;

        // Selection Sort O(n²)
        for (int i = 0; i < vetor.length - 1; i++) {
            posicao_menor = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }

            // Se encontrou uma posição diferente, faz a troca
            if (posicao_menor != i) {
                aux = vetor[i];
                vetor[i] = vetor[posicao_menor];
                vetor[posicao_menor] = aux;
                trocas++;
            }
        }

        return new Resultado(vetor, trocas);
    }
}

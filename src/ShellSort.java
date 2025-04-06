public class ShellSort {
    public static Resultado sort(int[] vetor) {
        int trocas = 0;
        int n = vetor.length;

        // Geração do incremento (sequência de Knuth: h = h * 3 + 1)
        int h = 1;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = h / 3;

        int elemento, j;

        while (h > 0) {
            for (int i = h; i < n; i++) {
                elemento = vetor[i];
                j = i;

                while (j >= h && vetor[j - h] > elemento) {
                    vetor[j] = vetor[j - h];
                    j -= h;
                    trocas++;
                }

                vetor[j] = elemento;
                trocas++;
            }

            h = h / 2;
        }

        return new Resultado(vetor, trocas);
    }
}

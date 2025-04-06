public class ComboSort {
    public static Resultado sort(int[] vetor) {
        int trocas = 0;
        int n = vetor.length;
        int gap = n;
        boolean trocou = true;
        final double SHRINK = 1.3;

        while (gap > 1 || trocou) {
            // Atualiza o gap
            gap = (int) (gap / SHRINK);
            if (gap < 1) {
                gap = 1;
            }

            trocou = false;

            for (int i = 0; i + gap < n; i++) {
                if (vetor[i] > vetor[i + gap]) {
                    // Troca os elementos
                    int temp = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = temp;
                    trocas++;
                    trocou = true;
                }
            }
        }

        return new Resultado(vetor, trocas);
    }
}

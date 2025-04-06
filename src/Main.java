public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[100000];

        // Preenchendo vetor com valores aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        long inicio, fim;

        // ------------------ BUBBLE SORT ---------------------
        System.out.println("\n--- Bubble Sort ---");
        inicio = System.currentTimeMillis();
        Resultado resultadoBubble = BubbleSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio) + "ms");
        System.out.println("Trocas: " + resultadoBubble.getTrocas());

        // ------------------ INSERTION SORT ---------------------
        System.out.println("\n--- Insertion Sort ---");
        inicio = System.currentTimeMillis();
        Resultado resultadoInsertion = InsertionSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio) + "ms");
        System.out.println("Trocas: " + resultadoInsertion.getTrocas());

        // ------------------ COMBO SORT ---------------------
        System.out.println("\n--- Combo Sort ---");
        inicio = System.currentTimeMillis();
        Resultado resultadoCombo = ComboSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio) + "ms");
        System.out.println("Trocas: " + resultadoCombo.getTrocas());

        // ------------------ SELECTION SORT ---------------------
        System.out.println("\n--- Selection Sort ---");
        inicio = System.currentTimeMillis();
        Resultado resultadoSelection = SelectionSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio) + "ms");
        System.out.println("Trocas: " + resultadoSelection.getTrocas());

        // ------------------ SHELL SORT ---------------------
        System.out.println("\n--- Shell Sort ---");
        inicio = System.currentTimeMillis();
        Resultado resultadoShell = ShellSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio) + "ms");
        System.out.println("Trocas: " + resultadoShell.getTrocas());
    }
}

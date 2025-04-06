public class Resultado {
    private int[] vetor;
    private int trocas;

    // Construtor
    public Resultado(int[] vetor, int trocas) {
        this.vetor = vetor;
        this.trocas = trocas;
    }

    // Getter do vetor ordenado
    public int[] getVetor() {
        return vetor;
    }

    // Getter da quantidade de trocas
    public int getTrocas() {
        return trocas;
    }
}

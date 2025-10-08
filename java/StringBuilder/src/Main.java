public class Main {
    public static void main(String[] args) {
        int N = 100_000; // Numero di concatenazioni

        // --- Test con String ---
        long startString = System.nanoTime();
        String testo = "";
        for (int i = 0; i < N; i++) {
            testo += i; // ogni volta crea un nuovo oggetto String
        }
        long endString = System.nanoTime();
        long tempoString = endString - startString;

        // --- Test con StringBuilder ---
        long startBuilder = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            builder.append(i);
        }
        String risultato = builder.toString(); // converto solo alla fine
        long endBuilder = System.nanoTime();
        long tempoBuilder = endBuilder - startBuilder;

        // --- Risultati ---
        System.out.println("Tempo con String:       " + tempoString / 1_000_000 + " ms");
        System.out.println("Tempo con StringBuilder:" + tempoBuilder / 1_000_000 + " ms");
        System.out.println("Differenza:             " + (tempoString - tempoBuilder) / 1_000_000 + " ms");
    }
}

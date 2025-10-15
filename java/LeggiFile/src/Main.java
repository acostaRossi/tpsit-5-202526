import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String percorsoFile = "/Users/albertocosta/Dev/Scuola/202526/tpsit5/java/LeggiFile/src/esempio.txt"; // Sostituisci con il percorso del tuo file
        // Try-with-resources per chiudere automaticamente i reader
        try (FileReader fr = new FileReader(percorsoFile);
             BufferedReader br = new BufferedReader(fr)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea); // Stampa ogni linea del file
            }

        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
    }
}

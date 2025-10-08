import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creazione di una HashMap
        // Chiave: String   |  Valore: Integer
        HashMap<String, Integer> punteggi = new HashMap<>();

        // Inserimento di coppie chiave → valore
        punteggi.put("Anna", 85);
        punteggi.put("Luca", 92);
        punteggi.put("Marco", 78);

        // Accesso a un valore tramite la chiave
        System.out.println("Punteggio di Luca: " + punteggi.get("Luca"));

        // Aggiornamento di un valore
        punteggi.put("Anna", 90); // sovrascrive il valore precedente

        // Rimozione di un elemento
        punteggi.remove("Marco");

        // Scorrimento di tutte le coppie (entrySet)
        System.out.println("\nElenco punteggi:");
        for (Map.Entry<String, Integer> entry : punteggi.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Metodi utili
        System.out.println("\nNumero di elementi: " + punteggi.size());
        System.out.println("Contiene Anna? " + punteggi.containsKey("Anna"));
        System.out.println("Contiene punteggio 92? " + punteggi.containsValue(92));

        // Pulizia della mappa
        punteggi.clear();
        System.out.println("\nDopo clear(): " + punteggi.size() + " elementi");
    }
}

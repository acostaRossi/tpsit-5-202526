import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Creazione di una LinkedList di stringhe
        LinkedList<String> nomi = new LinkedList<>();

        // Aggiunta di elementi
        nomi.add("Anna");
        nomi.add("Luca");
        nomi.add("Marco");

        // Aggiunta in testa e in coda (metodi specifici di LinkedList)
        nomi.addFirst("Inizio");
        nomi.addLast("Fine");

        // Accesso agli elementi
        System.out.println("Primo elemento: " + nomi.getFirst());
        System.out.println("Ultimo elemento: " + nomi.getLast());

        // Rimozione di elementi
        nomi.removeFirst(); // rimuove il primo
        nomi.removeLast();  // rimuove l’ultimo

        // Scorrimento con for-each
        System.out.println("\nContenuto della lista:");
        for (String nome : nomi) {
            System.out.println("- " + nome);
        }

        // Altri metodi utili
        System.out.println("\nContiene Luca? " + nomi.contains("Luca"));
        System.out.println("Dimensione: " + nomi.size());
    }
}

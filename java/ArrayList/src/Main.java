import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creazione di un ArrayList di stringhe
        ArrayList<String> nomi = new ArrayList<>();

        // Aggiunta di elementi
        nomi.add("Anna");
        nomi.add("Luca");
        nomi.add("Marco");
        nomi.add("Sara");

        // Accesso agli elementi
        System.out.println("Il primo nome è: " + nomi.get(0));

        // Modifica di un elemento
        nomi.set(1, "Giulia"); // Sostituisce "Luca" con "Giulia"

        // Rimozione di un elemento
        nomi.remove("Marco"); // Rimuove "Marco" per valore

        // Scorrimento con for-each
        System.out.println("\nLista dei nomi:");
        for (String nome : nomi) {
            System.out.println("- " + nome);
        }

        // Altri metodi utili
        System.out.println("\nLa lista contiene Sara? " + nomi.contains("Sara"));
        System.out.println("Numero di elementi: " + nomi.size());

        // Pulizia della lista
        nomi.clear();
        System.out.println("\nLista svuotata. Numero di elementi: " + nomi.size());
    }
}

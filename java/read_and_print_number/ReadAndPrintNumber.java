import java.util.Scanner;

public class ReadAndPrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // utile per pulire il buffer
        System.out.println("Hai inserito il numero: " + numero);

        System.out.print("Inserisci un testo: ");
        String testo = scanner.nextLine();
        System.out.println("Hai inserito il testo: " + testo);

        System.out.print("Inserisci un numero: ");
        String numeroComeTesto = scanner.nextLine();
        int n;
        try {
            n = Integer.parseInt(numeroComeTesto);
            System.out.println("Hai inserito il numero: " + n);
        } catch(NumberFormatException ex) {
            System.out.println("Errore: non hai inserito un numero.");
        }
    }
}

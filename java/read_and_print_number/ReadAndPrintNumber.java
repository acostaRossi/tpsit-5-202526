import java.util.Scanner;

public class ReadAndPrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        System.out.println("Hai inserito il numero: " + numero);
    }
}

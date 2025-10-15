import java.util.concurrent.Callable;

public class MioCallable implements Callable<Integer> {

    private int numero;

    // Costruttore
    public MioCallable(int numero) {
        this.numero = numero;
    }

    // Metodo call() eseguito dal thread — può restituire un valore ed eccezioni
    @Override
    public Integer call() throws Exception {
        System.out.println("Esecuzione del thread implementando Callable: " + numero);

        // Simuliamo un'elaborazione che richiede tempo
        Thread.sleep(1000);

        return numero * numero; // Restituisce il valore
    }
}

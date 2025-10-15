
public class Main {
    public static void main(String[] args) {
        MioRunnable mRunnable = new MioRunnable(5);
        Thread tRunnable = new Thread(mRunnable);
        tRunnable.start();
        try {
            tRunnable.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Risultato con Runnable: " + mRunnable.getRisultato());

        MioThread tThread = new MioThread(10);
        tThread.start();
        try {
            tThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Risultato con Thread: " + tThread.getRisultato());

        // Creiamo un oggetto MioCallable
        MioCallable tCallable = new MioCallable(15);
        try {
            int n = tCallable.call();
            System.out.println("Risultato con Callable: " + n);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
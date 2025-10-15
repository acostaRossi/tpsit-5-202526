public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            // WITHOUT ATOMIC
            Numero.conta.increment();
            // WITH ATOMIC
            //Numero.conta.addAndGet(1);
        }
    }
}

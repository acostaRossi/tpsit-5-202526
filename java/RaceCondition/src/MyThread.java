public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // WITHOUT ATOMIC
            Numero.incrementa();
            // WITH ATOMIC
            //Numero.conta.addAndGet(1);
        }
    }
}

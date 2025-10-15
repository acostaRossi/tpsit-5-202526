class MioThread extends Thread {

    private int numero;

    public MioThread(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        System.out.println("Esecuzione del thread estendendo Thread: " + numero);

        // Simuliamo un'elaborazione che richiede tempo
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        numero = numero * numero;
    }

    public int getRisultato() {
        return numero;
    }

    public static void main(String[] args) {
        MioThread t = new MioThread(7);
        t.start(); // Avvia il thread (NON usare run() direttamente!)
    }
}
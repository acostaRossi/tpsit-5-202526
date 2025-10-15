class MioRunnable implements Runnable {

    private int numero;

    public MioRunnable(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        System.out.println("Esecuzione del thread implementando Runnable: " + numero);

        // Simuliamo un'elaborazione che richiede tempo
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        numero = 7 * 7;
    }

    public int getRisultato() {
        return numero;
    }
}

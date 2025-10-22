class BufferCondiviso {

    private int dato;
    private boolean disponibile = false;
    
    // Scrive un dato nel buffer
    public synchronized void produce(int valore) {
        // se il buffer è pieno, aspetta
        while (disponibile) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dato = valore;
        disponibile = true;
        System.out.println("Produttore ha prodotto: " + valore);
        // risveglia un consumatore in attesa
        notify();
    }

    // Legge un dato dal buffer
    public synchronized int consume() {
        // se il buffer è vuoto, aspetta
        while (!disponibile) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        disponibile = false;
        System.out.println("Consumatore ha consumato: " + dato);
        // risveglia un produttore in attesa
        notify();
        return dato;
    }
}

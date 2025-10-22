// TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret
// at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.
// wait() → mette un thread in attesa fino a quando un altro thread
// non chiama notify() o notifyAll() sullo stesso oggetto monitor.
// notify() → risveglia un solo thread in attesa sul monitor.
// notifyAll() → risveglia tutti i thread in attesa sul monitor.
// Questi metodi possono essere chiamati solo dentro un blocco sincronizzato
// (synchronized).

// In questo esempio:
// Il Produttore mette un numero in un buffer.
// Il Consumatore preleva il numero.
// Si coordinano usando wait() e notify() per evitare conflitti.

public class EsempioWaitNotify {

    public static void main(String[] args) {

        BufferCondiviso buffer = new BufferCondiviso();

        // Thread produttore
        Thread produttore = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        // Thread consumatore
        Thread consumatore = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        produttore.start();
        consumatore.start();
    }
}
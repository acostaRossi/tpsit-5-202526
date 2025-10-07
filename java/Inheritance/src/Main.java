public class Main {
    public static void main(String[] args) {
        LoggerManager loggerManager = new LoggerManager();

        // Aggiungiamo diversi logger
        loggerManager.addLogger(new ConsoleLogger());
        loggerManager.addLogger(new FileLogger("log.txt"));
        loggerManager.addLogger(new DatabaseLogger());

        // Log di un messaggio su tutte le destinazioni
        loggerManager.log("Messaggio di test per tutti i logger");
    }
}

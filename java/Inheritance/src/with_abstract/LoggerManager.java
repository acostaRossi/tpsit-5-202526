package with_abstract;

import java.util.ArrayList;
import java.util.List;

// Gestore centralizzato dei log
class LoggerManager {
    private List<Logger> loggers = new ArrayList<>();

    public void addLogger(Logger logger) {
        loggers.add(logger);
    }

    public void log(String message) {
        for (Logger logger : loggers) {
            logger.log(message); // polimorfismo in azione
        }
    }
}

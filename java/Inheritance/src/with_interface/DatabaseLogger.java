package with_interface;

// with_interface.Logger su database (simulato)
class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("with_interface.DatabaseLogger: saved '" + message + "' in database");
    }
}

// Logger su database (simulato)
class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("DatabaseLogger: saved '" + message + "' in database");
    }
}

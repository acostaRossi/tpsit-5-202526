package with_abstract;

class DatabaseLogger extends Logger {
    @Override
    public void log(String message) {
        System.out.println("with_interface.DatabaseLogger: saved '" + message + "' in database");
    }
}

package with_interface;

// with_interface.Logger su console
class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("with_interface.ConsoleLogger: " + message);
    }
}

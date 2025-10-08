package with_abstract;

class ConsoleLogger extends Logger {
    @Override
    public void log(String message) {
        System.out.println("with_interface.ConsoleLogger: " + message);
    }
}

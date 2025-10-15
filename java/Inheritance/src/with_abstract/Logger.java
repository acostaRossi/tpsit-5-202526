package with_abstract;

abstract class Logger {
    abstract void log(String message);

    public String test() {
        return "Test";
    }
    
    @Override
    public String toString() {
        return "Logger";
    }
}
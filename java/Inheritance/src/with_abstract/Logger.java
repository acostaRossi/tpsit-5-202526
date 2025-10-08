package with_abstract;

abstract class Logger {
    abstract void log(String message);
    
    @Override
    public String toString() {
        return "Logger";
    }
}
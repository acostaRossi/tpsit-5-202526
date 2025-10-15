package with_interface;

public interface Logger {
    void log(String message);

    default String test() {
        return "test";
    }
}
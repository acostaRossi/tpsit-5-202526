public class MyAtomicInteger {
    private int value;

    public MyAtomicInteger(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    synchronized public void increment() {
        value++;
    }
}

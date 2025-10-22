public class MyAtomicInteger {
    private int value;

    public MyAtomicInteger(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void increment() {
        value++;
    }
}

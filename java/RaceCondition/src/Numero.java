import java.util.concurrent.atomic.AtomicInteger;

public class Numero {
    // WITHOUT ATOMIC
    public static MyAtomicInteger conta = new MyAtomicInteger(0);
    // WITH ATOMIC
    //public static AtomicInteger conta = new AtomicInteger(0);
}

import java.util.concurrent.atomic.AtomicInteger;

public class Numero {
    // WITHOUT ATOMIC
    public static int conta = 0;
    // WITHOUT ATOMIC
    //public static MyAtomicInteger conta = new MyAtomicInteger(0);
    // WITH ATOMIC
    //public static AtomicInteger conta = new AtomicInteger(0);
    synchronized public static void incrementa(){
        conta++;
    }
}

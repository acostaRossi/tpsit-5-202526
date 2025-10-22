import java.util.*;

public class App {

    public void run() {
        System.out.println("Hello World!");

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aaaa", 1);
        hm.put("bbbb", 2);
        hm.put("cccc", 3);

        int n = hm.get("cccc");
        System.out.println(n);

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        
    }
}

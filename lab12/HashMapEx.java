import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<Integer, String>();

        h.put(1001, "Ewha Kim");
        h.put(1002, "Ewha Park");
        h.put(1003, "Ewha Choe");
        h.put(1004, "Ewha Han");

        System.out.println(h.get(1003));

        Set<Integer> key = h.keySet();
        Iterator<Integer> it = key.iterator();

        System.out.println("============");
        while (it.hasNext())
            System.out.println(h.get(it.next()));
    }
}

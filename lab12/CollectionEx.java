import java.util.*;

public class CollectionEx {
    public static void main(String[] args) {
        ArrayList<String> v = new ArrayList<String>();

        v.add("kiwi");
        v.add("pear");
        v.add("banana");
        v.add("apple");

        Collections.sort(v);

        for (int i = 0; i < v.size(); i++)
            System.out.println(v.get(i) + " ");
        System.out.println();
    }

}

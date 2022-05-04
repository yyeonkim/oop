import javax.lang.model.util.ElementScanner6;

public class DixEx {
    public static void main(String[] args) {
        String s1 = new String("apple");
        String s2 = new String("cherry");

        int check = s1.compareTo(s2);
        if (check < 0) // s1이 s2보다 순서가 앞이면: 음수
            System.out.println(s1 + " - " + s2);
        else if (check == 0) // s1 == s2
            System.out.println(s1);
        else // s1인 s2보다 순서가 뒤면: 양수
            System.out.println(s2 + " - " + s1);
    }
}

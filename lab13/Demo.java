import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        String in = "a b a b c c c # c c c b a b a";
        boolean check = true;
        String[] p = in.split(" ");

        for (int i = 0; i < (p.length / 2); i++)
            stack.push(p[i]);

        for (int i = (p.length / 2) + 1; i < p.length; i++) {
            String top = stack.pop();
            System.out.print("top: " + top);
            System.out.printf(" --> p[%d]: %s\n", i, p[i]);
            System.out.println(stack);
            if (!top.equals(p[i])) {
                check = false;
                break;
            }
        }
        if (check)
            System.out.println("True");
        else
            System.out.println("False");

    }
}

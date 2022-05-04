import java.io.IOException;
import java.util.Scanner;

public class ComputeEx04 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        System.out.print("First number: ");
        int a = s.nextInt();

        System.out.print("Second number: ");
        int b = s.nextInt();

        System.out.println("Choose one: Add(+), Substract(-), Multiply(*), Divide(/)");
        char k = (char) System.in.read();

        int result = 0;
        if (k == '+') {
            result = a + b;
            System.out.printf("%d + %d = %d\n", a, b, result);
        }
        if (k == '-') {
            result = a - b;
            System.out.printf("%d - %d = %d\n", a, b, result);
        }
        if (k == '*') {
            result = a * b;
            System.out.printf("%d * %d = %d\n", a, b, result);
        }
        if (k == '/') {
            result = a / b;
            System.out.printf("%d / %d = %d\n", a, b, result);
        }
        s.close();
    }
}

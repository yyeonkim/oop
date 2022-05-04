import java.util.Scanner;

public class ComputeEx02 {
    public static void main(String[] args) {
        System.out.print("Enter two integers: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int result = a + b;
        System.out.printf("%d + %d = %d\n", a, b, result);

        result = a - b;
        System.out.printf("%d - %d = %d\n", a, b, result);

        result = a * b;
        System.out.printf("%d * %d = %d\n", a, b, result);

        result = a / b;
        System.out.printf("%d / %d = %d\n", a, b, result);

        s.close();
    }
}

import java.util.Scanner;

public class ComputeEx03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("First number: ");
        int a = s.nextInt();

        System.out.print("Second number: ");
        int b = s.nextInt();

        System.out.println("Choose one: 1.Add(+), 2.Substract(-), 3.Multiply(*), 4.Divide(/)");
        int calc = s.nextInt();

        int result = 0;
        if (calc == 1) {
            result = a + b;
            System.out.printf("%d + %d = %d\n", a, b, result);
        }
        if (calc == 2) {
            result = a - b;
            System.out.printf("%d - %d = %d\n", a, b, result);
        }
        if (calc == 3) {
            result = a * b;
            System.out.printf("%d * %d = %d\n", a, b, result);
        }
        if (calc == 4) {
            result = a / b;
            System.out.printf("%d / %d = %d\n", a, b, result);
        }
        s.close();
    }
}

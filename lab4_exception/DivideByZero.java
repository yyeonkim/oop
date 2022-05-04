import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the divided number: ");
        int divided = s.nextInt();

        System.out.print("Enter the number of shares: ");
        int divisor = s.nextInt();

        try {
            System.out.println("Result: " + divided / divisor);
        } catch (ArithmeticException e) {
            System.out.println("cannot not be divied by zero");
        }

        s.close();
    }
}
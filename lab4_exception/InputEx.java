import java.util.Scanner;
import java.util.InputMismatchException;

public class InputEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0, num = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            try {
                num = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not integar");
                s.next();
                i--;
                continue;
            }
            sum += num;
        }
        System.out.println("Sum: " + sum);
        s.close();
    }

}

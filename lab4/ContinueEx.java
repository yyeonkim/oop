import java.util.Scanner;

public class ContinueEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter five numbers:");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = s.nextInt();
            if (num > 0) {
                sum += num;
            } else {
                continue;
            }
        }
        System.out.println("Sum = " + sum);
        s.close();
    }
}

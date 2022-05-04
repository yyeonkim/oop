import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers(exit: -1): ");

        int n = s.nextInt();
        int sum = 0;
        int count = 0;
        while (n != -1) {
            sum += n;
            count++;
            n = s.nextInt();
        }
        if (count == 0)
            System.out.println("Nothing");
        else
            System.out.println("Avg = " + sum / count + ", count = " + count);
        s.close();
    }
}
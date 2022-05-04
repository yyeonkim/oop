import java.util.Scanner;

public class ChangeEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = s.nextInt();

        int c1 = amount / 500;
        amount %= 500;
        System.out.printf("500원 => %d개\n", c1);

        int c2 = amount / 100;
        amount %= 100;
        System.out.printf("100원 => %d개\n", c2);

        int c3 = amount / 50;
        amount %= 50;
        System.out.printf("50원 => %d개\n", c3);

        int c4 = amount / 10;
        System.out.printf("10원 => %d개\n", c4);

        s.close();
    }
}
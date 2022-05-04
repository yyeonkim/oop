import java.util.Random;
import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner s = new Scanner(System.in);

        System.out.print("요소 수: ");
        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = 10 + rand.nextInt(90); // 10 ~ 99
            System.out.println("a[" + i + "] = " + a[i]);
        }
        for (int i = 0; i < n / 2; i++) { // Reverse
            int t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        System.out.println("요소를 역순으로 출력");
        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "] = " + a[i]);

        s.close();
    }
}
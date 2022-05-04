import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter five numbers: ");

        int[] nums = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            nums[i] = s.nextInt();
            sum += nums[i];
        }

        int large = nums[0];
        for (int i = 0; i < 5; i++) {
            if (large < nums[i])
                large = nums[i];
        }

        System.out.println("Largest: " + large + ", Svg: " + sum);
    }
}

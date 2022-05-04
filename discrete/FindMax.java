package discrete;

import java.util.Random;
import java.util.Arrays;

public class FindMax {
    public static int[] maxNum(int[] a) { // 가장 큰 수 2개 찾는 함수
        int large1 = a[0], large2 = a[0];

        for (int i = 1; i < a.length; i++) {
            if (large1 < a[i])
                large1 = a[i];
            if (large2 < a[i] && a[i] < large1) // large 1 != large 2
                large2 = a[i];
        }
        int[] largeNums = { large1, large2 }; // return array

        return largeNums;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) { // assign randNums to the array
            nums[i] = rand.nextInt(50);
            System.out.print(nums[i] + " ");
        }
        System.out.println("");

        int[] largeNums = maxNum(nums); // Use masNum method

        System.out.println(Arrays.toString(largeNums));

    }

}

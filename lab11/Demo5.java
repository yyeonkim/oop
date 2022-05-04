public class Demo5 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        Integer[] A = { Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8) };
        int sum = 0;

        for (int i = 0; i < a.length; i++)
            sum += a[i];

        for (int i = 0; i < A.length; i++)
            sum += A[i].intValue();

        System.out.println(sum);

    }
}

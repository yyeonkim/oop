public class ForEach {
    enum Week {
        Mons, Tues, Wednes, Thurs, Fri, Satur, Sun
    }

    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4, 5 };
        int sum = 0;

        String[] fruits = { "cherry", "strawberry", "banana", "grapes" };

        for (int k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("Sum: " + sum);

        for (String k : fruits) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (Week k : Week.values()) {
            System.out.print(k + "day ");
        }
        System.out.println();
    }
}

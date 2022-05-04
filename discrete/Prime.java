public class Prime {
    public static int isPrime(int n) {
        for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
            if (n % i == 0)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4141));
    }
}
public class ExMessage {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

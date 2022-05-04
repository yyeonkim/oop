public class ExMessage01 {
    public static void main(String[] args) {
        int a = 1000, b = 0;
        int result;

        try {
            if (b == 0)
                throw new Exception("cannot be divided by zero");
            result = a / b;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class NumEx {
    public static void main(String[] args) {
        String[] stringNumber = { "23", "12", "998", "3.14" };

        try {
            for (int i = 0; i < stringNumber.length; i++) {
                int j = Integer.parseInt(stringNumber[i]);
                System.out.println("Converted value to integer: " + j);
            }
        } catch (NumberFormatException e) {
            System.out.println("Cannot be converted to integer");
        }
    }
}

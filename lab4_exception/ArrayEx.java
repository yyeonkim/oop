public class ArrayEx {
    public static void main(String[] args) {
        int[] intArray = new int[4];

        try {
            for (int i = 0; i <= 4; i++) {
                intArray[i] = i;
                System.out.println("intArray[" + i + "] = " + intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of range");
        }
    }
}

public class ArrayParameterEx {
    public static void main(String[] args) {
        String str = "This is a Pencil";
        char[] c = str.toCharArray();

        ArrayParameter.printCharArray(c);
        ArrayParameter.replaceSpace(c);
        ArrayParameter.printCharArray(c);
    }
}

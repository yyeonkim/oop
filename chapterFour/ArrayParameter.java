package chapterFour;

public class ArrayParameter {
    static void replaceSpace(char[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == ' ')
                a[i] = ',';
    }

    static void printcharArray(char[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "This is a pencil.";
        char[] c = str.toCharArray();
        ArrayParameter.printcharArray(c);
        ArrayParameter.replaceSpace(c);
        ArrayParameter.printcharArray(c);
    }
}

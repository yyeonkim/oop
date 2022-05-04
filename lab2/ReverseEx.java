import java.util.Scanner;

public class ReverseEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = s.nextLine();

        for (int i = str.length() - 1; i >= 0; i--)
            System.out.printf("%c", str.charAt(i));

        s.close();
        System.out.println();
    }
}

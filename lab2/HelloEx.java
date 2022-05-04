import java.util.Scanner;

public class HelloEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Hi! Nice to meet you, " + name);
        s.close();
    }
}

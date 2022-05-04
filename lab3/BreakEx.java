import java.util.Scanner;

public class BreakEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 'exit' to exit");

        while (true) {
            System.out.print("Enter the data: ");
            String str = s.nextLine();
            if (str.equals("exit"))
                break;
        }
        System.out.println("Exit");
        s.close();
    }
}

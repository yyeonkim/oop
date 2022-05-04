import java.util.Scanner;
import java.util.Random;

public class RockPaperEx {
    final int ROCK = 0, SICSSOR = 1, PAPER = 2;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Choose one (0: Rock, 1: Scissor, 2: Paper): ");
        int user = s.nextInt();
        int computer = rand.nextInt(3);

        System.out.print("User(");
        if (user == 0)
            System.out.print("Rock");
        else if (user == 1)
            System.out.print("Scissor");
        else
            System.out.print("Paper");
        System.out.print(") : Computer(");
        if (computer == 0)
            System.out.print("Rock");
        else if (computer == 1)
            System.out.print("Scissor");
        else
            System.out.print("Paper");
        System.out.println(")");

        if (computer == (user + 1) % 3)
            System.out.println("You win!");
        else if (user == computer)
            System.out.println("Tie");
        else
            System.out.println("You lose..");

        s.close();

    }

}

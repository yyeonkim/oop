import java.util.Random;

public class LottoEx {
    public static void main(String[] args) {
        Random rand = new Random();
        int lucky = rand.nextInt(10); // 0~9 randNum
        System.out.println("Lucky Number = " + lucky);
    }
}

import java.util.Scanner;

public class InfoEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("이름 도시 나이 체중 미혼 여부를 빈칸으로 분리하여 입력하세요!");
        String name = s.next();
        System.out.println("이름: " + name);

        String city = s.next();
        System.out.println("도시: " + city);

        int age = s.nextInt();
        System.out.println("나이: " + age);

        double weight = s.nextDouble();
        System.out.println("체중: " + weight);

        boolean single = s.nextBoolean();
        System.out.println("미혼 여부: " + single);

        s.close();
    }
}

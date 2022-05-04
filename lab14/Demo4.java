import java.io.*;

public class Demo4 {
    public static void main(String[] args) {
        // 한 문자씩 read (문자 단위)
        try {
            FileReader in = new FileReader("text.txt");
            int c;
            while ((c = in.read()) != -1)
                System.out.print((char) c);
            System.out.println();
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

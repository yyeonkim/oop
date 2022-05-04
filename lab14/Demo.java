import java.io.*;

public class Demo {
    public static void main(String[] args) {
        // 한 문자씩 read (바이트 단위)
        try {
            InputStreamReader rd = new InputStreamReader(System.in);
            int c = rd.read();
            System.out.println((char) c);
            rd.close();
        } catch (IOException e) {
            System.out.println("Cannot read");
        }
    }
}
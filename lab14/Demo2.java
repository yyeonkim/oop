import java.io.*;

public class Demo2 {
    public static void main(String[] args) {
        // file로 문자만 write and read (바이트 단위)
        try {
            FileOutputStream fout = new FileOutputStream("out.txt");
            for (int i = 0; i < 10; i++) {
                int n = 10 - i;
                fout.write(n);
            }
            fout.close();

            FileInputStream fin = new FileInputStream("out.txt");
            int c = 0;
            while ((c = fin.read()) != -1)
                System.out.println(c + " ");
            fin.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

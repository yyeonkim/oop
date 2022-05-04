import java.io.*;

public class Demo5 {
    public static void main(String[] args) {
        int c;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            FileWriter fout = new FileWriter("outfile2.txt"); // 문자 단위
            while ((c = in.read()) != -1)
                fout.write(c);
            in.close();
            fout.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

package ab;

public class ABDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.p = 5;
        // a.n = 5;

        b.p = 5;
        // b.n = 5;
        b.setN(10);
        int i = b.getN(); // i = 10

        // b.m = 20;
        b.setM(20);
        System.out.println(b.toString()); // 10 20
    }
}

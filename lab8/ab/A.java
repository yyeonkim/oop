package ab;

public class A {
    int a1, a2;

    public A() {
        System.out.println("A");
    }

    public A(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
        System.out.println("A1");
    }

    public void showA() {
        System.out.println(a1 + ", " + a2);
    }
}
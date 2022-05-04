package circle;

public class Circle {
    int radius;
    String name;

    public static final double PI = 3.14;

    public Circle() {
        this(2, "");
    }

    public Circle(int r, String name) {
        this.radius = r;
        this.name = name;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}

package point;

public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        p.showPoint();

        ColorPoint cp = new ColorPoint(3, 4, "blue");
        cp.showColorPoint();
    }
}

package rect;

public class RectangleEx {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(20, 30);

        r1.setWidth(5.0);
        r1.setHeight(10.0);

        double area1 = r1.getArea();
        double width1 = r1.getWidth();
        double height1 = r1.getHeight();

        System.out.println("r1 area: " + area1 + " r1 width: " + width1 + " r1 height: " + height1);

        r2.setWidth(5.0);
        r2.setHeight(3.0);

        double area2 = r2.getArea();
        double width2 = r2.getWidth();
        double height2 = r2.getHeight();

        System.out.println("r2 area: " + area2 + " r2 width: " + width2 + " r2 height: " + height2);
    }
}

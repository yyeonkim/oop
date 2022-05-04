package shapes;

public class Triangle extends TwoDShape {
    public String style;

    public Triangle(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    public double area() {
        return width * height / 2;
    }

    public void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

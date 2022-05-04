package shapes;

public class Rectangle extends TwoDShape {
    public boolean isSquare() {
        if (width == height)
            return true;
        return false;
    }

    public double area() {
        return width * height;
    }
}

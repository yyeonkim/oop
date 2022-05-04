package shapes;

public class TwoDShape {
    public double width, height;

    public TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    public void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

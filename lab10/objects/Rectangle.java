package objects;

public class Rectangle extends DObject {
    public Rectangle(int w, int h) {
        super(w, h);
    }

    @Override
    public void show() {
        System.out.print("Rectangle: ");
        System.out.println(width + " " + height + " " + area);

    }

}

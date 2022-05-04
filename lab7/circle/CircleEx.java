package circle;

public class CircleEx {
    public static void main(String[] args) {
        Circle pizza = new Circle(10, "Crab Pizza");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적: " + area);

        Circle donut = new Circle();
        donut.name = "Onion-ring Pizza";
        area = Circle.PI * donut.radius * donut.radius;
        System.out.println(donut.name + "의 면적: " + area);
    }
}

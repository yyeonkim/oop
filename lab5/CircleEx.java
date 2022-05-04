public class CircleEx {
    public static void main(String[] args) {
        Circle pizza = new Circle(10, "JavaPizza");
        double area = pizza.getArea();
        System.out.println("Area of " + pizza.name + ": " + area);

        Circle donut = new Circle();
        donut.name = "JavaDonut";
        area = donut.getArea();
        System.out.println("Area of " + donut.name + ": " + area);

    }
}
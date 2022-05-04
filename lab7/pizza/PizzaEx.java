package pizza;

public class PizzaEx {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Super Supreme");
        Pizza p2 = new Pizza("Cheese");
        Pizza p3 = new Pizza("Pepperoni");

        int n = Pizza.count;
        System.out.println("The number of sold pizza: " + n);
    }
}

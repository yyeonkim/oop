package calc;

public class ComputerEx {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("Area of the circle: " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("Area of the circle: " + computer.areaCircle(r));
    }
}

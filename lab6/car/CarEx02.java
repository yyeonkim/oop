package car;

import java.util.Scanner;

public class CarEx02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your car data");
        System.out.print("Name: ");
        String name = s.next();
        System.out.print("Width: ");
        int width = s.nextInt();
        System.out.print("Height: ");
        int height = s.nextInt();
        System.out.print("Length: ");
        int length = s.nextInt();
        System.out.print("Fuel: ");
        double fuel = s.nextDouble();

        Car myCar = new Car(name, width, height, length, fuel);

        while (true) {
            System.out.println(
                    "Current Location(" + myCar.getX() + "," + myCar.getY() + ") Leftover Fuel: " + myCar.getFuel());
            System.out.print("Move? [0: No, 1: Yes]: ");
            if (s.nextInt() == 0)
                break;

            System.out.print("Distance in x direction: ");
            double dx = s.nextDouble();
            System.out.print("Distance in y direction: ");
            double dy = s.nextDouble();

            if (!myCar.move(dx, dy))
                System.out.println("Run out of fuel!!");
        }
        s.close();

    }
}

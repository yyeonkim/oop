package chapterFour;

public class Vehicle {
    public int paasengers;
    public int fuelcap;
    public int mpg;

    public Vehicle(int p, int f, int m) {
        paasengers = p;
        fuelcap = f;
        mpg = m;
    }

    public int range() {
        return mpg * fuelcap;
    }

    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + "gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + "gallons of fuel.");
    }
}

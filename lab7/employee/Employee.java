package employee;

public class Employee {
    private String name;
    private double salary;

    private static int count = 0;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        count++;
    }

    protected void finalize() {
        count--;
    }

    // static method: return static parameter
    public static int getCount() {
        return count;
    }
}

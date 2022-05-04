package employee;

public class EmployeeEx {
    public static void main(String[] args) {
        Employee e1, e2, e3;
        e1 = new Employee("Ewha Kim", 35000);
        e2 = new Employee("Jaeseok Yu", 50000);
        e3 = new Employee("IU", 20000);

        int n = Employee.getCount();
        System.out.println("The number of employees: " + n);
    }
}

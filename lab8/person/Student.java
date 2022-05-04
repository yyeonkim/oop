package person;

public class Student extends Person {
    void set() {
        age = 22;
        name = "Ewha Kim";
        height = 167;
        setWeight(45);
    }

    void showStudent() {
        System.out.println("age: " + age);
        System.out.println("name: " + name);
        System.out.println("height: " + height);
        System.out.println("weight: " + getWeight());
    }
}

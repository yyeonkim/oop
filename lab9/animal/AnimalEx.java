package animal;

public class AnimalEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        System.out.println("============");

        Animal animal = null; // 레퍼런스 변수는 사용 가능
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("============");
    }
}

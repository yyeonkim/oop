package phone;

public abstract class Phone {
    // Field
    public String owner;

    // Contructor
    public Phone(String owner) {
        this.owner = owner;
    }

    // Method
    public void turnOn() {
        System.out.println("Turn on");
    }

    public void turnOff() {
        System.out.println("Turn off");
    }

}

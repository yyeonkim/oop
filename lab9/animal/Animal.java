package animal;

public abstract class Animal {
    public String kind;

    public void live() {
        System.out.println("Breath");
    }

    public abstract void sound();
}

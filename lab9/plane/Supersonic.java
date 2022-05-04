package plane;

public class Supersonic extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("Supersonic fly");
        } else {
            super.fly();
        }
    }

}

package phone;

public class PhoneEx {
    public static void main(String[] args) {
        // Phone p = new Phone(); // 추상 class 객체 생성 불가
        SmartPhone smartPhone = new SmartPhone("Ewha Kim");

        smartPhone.turnOn();
        smartPhone.search();
        smartPhone.turnOff();
    }
}

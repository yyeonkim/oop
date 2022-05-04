package inter;

public class SamsungPhone extends PDA implements PhoneInterface {

    @Override
    public void receiveCall() {
        System.out.println("전화 왔어요");

    }

    @Override
    public void sendCall() {
        System.out.println("따르릉");

    }

    public void flash() {
        System.out.println("전화기에 불 켜졌어요");
    }

    public void schedule() {
        System.out.println("일정관리");
    }

}

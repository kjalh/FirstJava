interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}

class SamsungPhone08 implements PhoneInterface{
	public void sendCall() {
		System.out.println("띠리리링");
	}
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() { System.out.println("전화기에 불이 켜졌습니다.");}
}

public class Code05_08 {

	public static void main(String[] args) {
		SamsungPhone08 phone = new SamsungPhone08();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();

	}

}

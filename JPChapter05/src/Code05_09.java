interface PhoneInterface09{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.print("**Phone**");
	}
}
interface MobilePhoneInterface09 extends PhoneInterface09{
	void sendSMS();
	void sendCall();
	void receiveSMS();
}
interface MP3Interface09{
	public void play();
	public void stop();
}
class PDA09{
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone09 extends PDA09 implements MobilePhoneInterface09, MP3Interface09{
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~");
		
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요.");
	}
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}

	
	
}
public class Code05_09 {

	public static void main(String[] args) {
		SmartPhone09 phone = new SmartPhone09();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3,  5));
		phone.schedule();

	}

}

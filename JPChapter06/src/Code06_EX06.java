import java.util.Calendar;
import java.util.Scanner;

class Calen{
	public Calen() {}
	public int getSec() {
		return Calendar.getInstance().get(Calendar.SECOND);
	}
}

public class Code06_EX06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Calen cal = new Calen();
		
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		int na, fa, nb, fb;
		
		System.out.print("황기태 시작<Enter> 키>> ");
		s.nextLine();
		na = cal.getSec();
		System.out.println("   현재 초 시간 = " + na);	
		
		System.out.print("10초 예상 후 <Enter> 키>> ");
		s.nextLine();
		fa = cal.getSec();
		System.out.println("   현재 초 시간 = " + fa);
		
		
		
		System.out.print("이재문 시작<Enter> 키>> ");
		s.nextLine();
		nb = cal.getSec();
		System.out.println("   현재 초 시간 = " + nb);	
		
		System.out.print("10초 예상 후 <Enter> 키>> ");
		s.nextLine();
		fb = cal.getSec();
		System.out.println("   현재 초 시간 = " + fb);
		
		int h = Math.abs((fa - na + 60) % 60); // 책의 값과 같게 나오게 하기 위함
		int l = Math.abs((fb - nb + 60) % 60);
		
		na = Math.abs(10 - ((fa - na + 60) % 60)); // 모든 경우의 수를 둠
		nb = Math.abs(10 - ((fb - nb + 60) % 60));
		
		String name = na<nb ? "황기태" : "이재문";
		System.out.printf("황기태의 결과 %d, 이재문의 결과 %d, 승자는 %s", h, l, name);
		

	}

}

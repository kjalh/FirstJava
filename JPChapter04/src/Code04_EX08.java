import java.util.Scanner;
public class Code04_EX08 {
	
	
	static class PhoneBook{
		String n, t, input;
		
		PhoneBook(String n, String t){
			this.n = n;
			this.t = t;
		}
		String n() {
			return n;
		}
		String tel() {
			return t;
		}
		
		boolean equal(String input) {
			this.input = input;			
			return n.equals(input);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		String n, t;
		String input;
		System.out.print("인원수>> ");
		num = s.nextInt();
		s.nextLine();
		
		PhoneBook[] P = new PhoneBook[num];
		
		for(int i = 0; i < P.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
			n = s.next();
			t = s.next();
			P[i] = new PhoneBook(n, t);
		}
		System.out.println("저장되었습니다...");
		s.nextLine();
		
		while(true) {
			System.out.print("검색할 이름>> ");
			input = s.nextLine();
				
			if(input.equals("그만"))
				break;
			
			boolean tf = false;
			
			for(int i=0; i<P.length;i++) {			
				if (P[i].equal(input)) {
					System.out.println(P[i].n + "의 번호는 " + P[i].t + "입니다.");
					tf = true;
					break;
				}
				else
					System.out.println(input + "이 없습니다.");
			}
			
		}
		
		
		
	}
	
}

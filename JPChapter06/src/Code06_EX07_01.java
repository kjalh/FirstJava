import java.util.Scanner;
import java.util.StringTokenizer;

public class Code06_EX07_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String a = s.nextLine();
			if(a.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			StringTokenizer t = new StringTokenizer(a ," ");
			System.out.println("어절 개수는 " + t.countTokens());
		}
		
		
	}

}

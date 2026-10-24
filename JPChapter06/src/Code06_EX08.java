import java.util.Scanner;

public class Code06_EX08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		String a = s.nextLine();
		
		for(int i = 1; i<a.length(); i++) {
			String result = a.substring(i);
			String aa = a.substring(0, i);
			System.out.println(result + aa);
			
			
		}
		
		
	}

}

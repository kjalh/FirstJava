import java.util.Scanner;

public class Code06_EX11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.print(">>");
		String t = s.nextLine();
		StringBuffer sb = new StringBuffer(t);
		
		while(true) {
			System.out.print("명령: ");
			String ch = s.nextLine();
			
			if(ch.equals("그만")) break;
			
			String []na = ch.split("!");
			if(na[0] == "" || na[1]== "") {
				System.out.println("잘못된 명령어입니다.");
				continue;
			}
			
			int i = sb.indexOf(na[0]);
			if(i == -1) {
				System.out.println("찾을 수 없습니다.");
				continue;
			}
			
			sb.replace(i, i + na[0].length(), na[1]);
			System.out.println(sb);
			
			
			
		}
		
	}

}

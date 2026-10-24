import java.util.Scanner;

public class Code06_EX09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String []g = {"가위", "바위", "보"};
		
		while(true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>> ");
			int p = s.nextInt();		
			if(p==4) break;		
			
			--p;
			
			int r = (int) (Math.random()*3); // 0가  1바  2보
			
			System.out.println("철수("+g[p]+")" + " : " + "철수("+g[r]+")");
			
			if(g[p].equals(g[r])) System.out.println("컴퓨터와 비겼습니다.");
			else if((g[p].equals("가위")&&g[r].equals("보"))||(g[p].equals("바위")&&g[r].equals("가위"))||(g[p].equals("보")&&g[r].equals("바위")))
				System.out.println("철수가 이겼습니다.");
			else System.out.println("컴퓨터가 이겼습니다.");
			
		}

		

	}

}

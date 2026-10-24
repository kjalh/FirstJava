import java.util.*;

public class Code07_EX02 {

	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<Character>();
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		double sum = 0;
				
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		str = s.nextLine();
		String[] J = str.split(" ");
		
		for(int i = 0; i < 6; i++ ) {
			ch = J[i].charAt(0);
			a.add(ch);
			
			switch (ch) {
				case 'A':
					sum += 4.0;
					break;
				case 'B':
					sum += 3.0;
					break;
				case 'C':
					sum += 2.0;
					break;
				case 'D':
					sum += 1.0;
					break;
				case 'F':
					sum += 0.0;
					break;
			}	
		}
		System.out.print(sum/6);
		
	}

}

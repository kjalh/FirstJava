package pppp;

import java.util.Scanner;

public class C10_11_01 {

	static void cal(int x, int y) {		
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자1 입력: ");
		int x = s.nextInt();
		
		System.out.print("숫자2 입력: ");
		int y = s.nextInt();
		
		s.close();
		cal(x, y);						
	}
}
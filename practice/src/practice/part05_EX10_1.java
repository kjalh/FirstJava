package practice;

import java.util.Scanner;

public class part05_EX10_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int sum = 0;
		
		System.out.print("초기값: ");
		int f = s.nextInt();
		System.out.print("끝값: ");
		int l = s.nextInt();
		System.out.print("증갓값: ");
		int p = s.nextInt();
							
		for(int i = f; i<=l; i+=p ) {
			sum += i;
		}
		
		System.out.printf("%d부터 %d까지 %d씩 증가한 합게는 %d입니다.", f, l, p, sum);
		

	}

}

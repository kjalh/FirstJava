package pppp;

import java.util.Scanner;

public class C10_11_02 {
	
	static void cal(double x, double y) {
		System.out.printf("%.1f + %.1f = %.1f\n", x, y, x+y);
		System.out.printf("%.1f - %.1f = %.1f\n", x, y, x-y);
		System.out.printf("%.1f * %.1f = %.1f\n", x, y, x*y);
		System.out.printf("%.1f / %.1f = %f\n", x, y, x/y);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자1 ==> ");
		double x = s.nextDouble();
		
		System.out.print("숫자2 ==> ");
		double y = s.nextDouble();
		
		cal(x,y);
	}

}

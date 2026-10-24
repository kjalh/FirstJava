package pppp;

import java.util.Scanner;

public class C10_11_05 {

	static void cal(double x, double y) {
		System.out.printf("%.2f + %.2f = %.2f\n", x, y, x+y);
		System.out.printf("%.2f - %.2f = %.2f\n", x, y, x - y);
		System.out.printf("%.2f * %.2f = %.2f\n", x, y, x * y);
		System.out.printf("%.2f / %.2f = %.2f\n", x, y, x / y);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double x, y;
		
		System.out.print("숫자1 ==> ");
		x = s.nextDouble();
		
		System.out.print("숫자2 ==> ");
		y = s.nextDouble();
		
		cal(x, y);
		
		
		
		
		
	}

}

import java.util.Scanner;
public class Code10_EX11 {
	static double cal(double x, double y) {
		System.out.printf("%f + %f = %f\n", x,y, x+y);
		System.out.printf("%f - %f = %f\n", x,y, x-y);
		System.out.printf("%f * %f = %f\n", x,y, x*y);
		System.out.printf("%f / %f = %f\n", x,y, x/y);
		
		return 0;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x, y;
		
		System.out.print("숫자1 = ");
		x = s.nextDouble();
		
		System.out.print("숫자2 = ");
		y = s.nextDouble();
		
		cal(x, y);
	}

}

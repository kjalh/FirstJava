import java.util.Scanner;

class Circle01{
	private double x, y;
	private int radius;
	public Circle01(double x, double y, int radius) {
		// x, y, radius 초기화
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+ x +","+ y + ")" + radius);
	}
}
public class Code04_EX05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Circle01 c[] = new Circle01[3];
		for(int i =0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = s.nextDouble();
			double y = s.nextDouble();
			int radius = s.nextInt();						
			c[i] = new Circle01(x, y, radius);  //new 중요
		}
		for(int i = 0; i<c.length; i++) c[i].show();
		s.close();
	}

}

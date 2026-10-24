import java.util.Scanner;

class Circle02{
	private double x, y;
	private int radius;
	public Circle02(double x, double y, int radius) {
		// x, y, radius 초기화
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void show() {
		System.out.println("가장 면적이 큰 원은 ("+ x +","+ y + ")" + radius);
	}
}

public class Code04_EX06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Circle02 c[] = new Circle02[3];
		int a= 0;
		for(int i =0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = s.nextDouble();
			double y = s.nextDouble();
			int radius = s.nextInt();						
			c[i] = new Circle02(x, y, radius);  //new 중요
		}
		
		if(c[0].getRadius()> c[1].getRadius() && c[0].getRadius()>c[2].getRadius())
			a = 0;
		else if(c[1].getRadius()> c[0].getRadius() && c[1].getRadius()>c[2].getRadius())
			a = 1;
		else if(c[2].getRadius()> c[0].getRadius() && c[2].getRadius()>c[1].getRadius())
			a = 2;
		
		c[a].show();

		s.close();
	}		
}

import java.util.Scanner;
public class Code_EX12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Turtle turtle = new Turtle();
		
		String m, c;
		int a, b, d;
		System.out.print("거북이 모양(turtle, circle, square, rectangle) ==> ");
		m = s.next();
		turtle.shape(m);
		
		System.out.print("거북이 펜 색상(red, blue, green, yellow, magenta) ==> ");
		c = s.next();
		turtle.penColor(c);
		
		while(true) {
			System.out.print("거북이 선 두깨 ==> ");
			a = s.nextInt();
			turtle.width(a);
			
			System.out.print("거북이의 회전 각도: ");
			b = s.nextInt();
			turtle.left(b);
			
			System.out.print("거북이의 이동 거리: ");
			d = s.nextInt();
			turtle.forward(d);
			
		}
		
	}

}

import java.util.Scanner;
public class EX04_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Turtle turtle = new Turtle();
		
		double x, y;
		int tsize;
		String color;
		turtle.up();
		
		while(true) {
			x = 0;
			System.out.print("X 위치 (-200 ~ +200) ==> ");
			x = s.nextDouble();
			System.out.print("Y 위치 (-200 ~ +200) ==> ");
			y = s.nextDouble();
			System.out.print("스탬프 크기(1~100) ==> ");
			tsize = s.nextInt();
			System.out.print("스탬프 색상(red, green, blue, black, yellow) ==> ");
			color = s.next();
			
			
			
			turtle.setPosition(x,y-30);
			turtle.down();
			
			turtle.shapeSize(tsize, tsize);
			turtle.outlineColor(color);
			turtle.fillColor(color);
			
			turtle.forward(30);
			turtle.stamp();
			turtle.left(90);
			turtle.forward(60);
			turtle.right(90);
			turtle.stamp();
			turtle.left(180);
			turtle.forward(60);
			turtle.left(180);
			turtle.stamp();
			turtle.right(90);
			turtle.forward(60);
			turtle.left(90);
			turtle.stamp();
			turtle.forward(60);
			
			turtle.up();
		}

	}

}

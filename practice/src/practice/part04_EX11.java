package practice;

import java.util.Scanner;

public class part04_EX11 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		Scanner s = new Scanner(System.in);
		int x, y;
		String C;
		while (true) {
			System.out.print("X 위치(-200 ~ +200) ==> ");
			x = s.nextInt();
			
			System.out.print("Y 위치(-200 ~ +200) ==> ");
			y = s.nextInt();
			
			System.out.print("스탬프 색상(red, green, blue, black, yellow) ==> ");
			C = s.next();
			
			t.up();
			t.setPosition(x + 30, y + 30);
			t.fillColor(C);
			t.stamp();
			
			t.down();
			t.right(90);
			t.forward(60);
			t.left(90);
			t.stamp();
			
			t.right(180);
			t.forward(60);
			t.right(180);
			t.stamp();
			
			t.left(90);
			t.forward(60);
			t.right(90);
			t.stamp();
			t.forward(60);
		}

	}

}

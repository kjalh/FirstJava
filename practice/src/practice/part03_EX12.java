package practice;

import java.util.Scanner;

public class part03_EX12 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		String style, C;
		int w, a, f;
		Scanner s = new Scanner(System.in);
		
		System.out.print("거북이 모양(turtle, circle, square, rectangle) ==> ");
		style = s.next();
		t.shape(style);
		
		System.out.print("거북이 펜 색상(red, blue, green, yellow, magenta) ==> ");
		C = s.next();
		t.penColor(C);
		
		System.out.print("거북이 선 두깨 ==> ");
		w = s.nextInt();
		t.width(w);
		
		while (true) {
			System.out.print("거북이의 회전 각도 : ");
			w = s.nextInt();
			t.left(w);
			
			System.out.print("거북이의 이동 거리 : ");
			f = s.nextInt();
			t.forward(f);		
		}
		
		
	}

}

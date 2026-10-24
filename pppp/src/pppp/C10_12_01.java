package pppp;

import java.time.LocalTime;

public class C10_12_01 {

	static int[] getTime() {
		LocalTime now = LocalTime.now();
		
		int h = now.getHour();
		int m = now.getMinute();
		int s = now.getSecond();
		
		return new int[] {h,m,s};
	}
	
	public static void main(String[] args) {
		Turtle t = new Turtle();	
		
		for(int i = 0; i < 12; i++) {
			t.penColor("GRAY");
			t.forward(150);
			t.forward(-150);
			t.right(30);
		}
		t.left(90);
		
		t.penColor("red");
		t.right(getTime()[0]*6);
		t.forward(130);
		t.backward(130);
		t.left(-getTime()[0]*6);
		
		t.penColor("blue");
		t.right(getTime() [1] * 30);
		t.forward(50);
		t.backward(50);
		t.left(-getTime() [1] * 30);
		
		t.penColor("green");
		t.left(getTime()[2] * 6);
		t.forward(100);
		

	}

}

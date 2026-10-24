package pppp;

import java.time.LocalTime;

public class C10_12_05 {
	static int[] getTime() {
		LocalTime now = LocalTime.now();
		
		int h = now.getHour();
		int m = now.getMinute();
		int s = now.getSecond();
		
		return new int[] {h, m, s};
	}
	public static void main(String[] args) {
		Turtle t = new Turtle();
		
		t.penColor("Gray");
		for(int i = 0; i < 12; i++) {
			t.forward(150);
			t.backward(150);
			t.right(30);
		}
		t.left(90);
		
		t.width(10);
		t.penColor("red");
		t.right(getTime()[0]*30);
		t.forward(80);
		t.backward(80);
		t.left(getTime()[0]*30);
		
		t.penColor("blue");
		t.right(getTime()[1]*6);
		t.forward(100);
		t.backward(100);
		t.left(getTime()[1]*6);
		
		
		t.width(5);
		t.penColor("green");
		t.right(getTime()[2]*6);
		t.forward(150);
		t.backward(150);
		t.left(getTime()[2]*6);
			
	}

}

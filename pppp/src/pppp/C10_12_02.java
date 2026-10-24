package pppp;

import java.time.LocalTime;

public class C10_12_02 {

	static int getTime()[] {
		LocalTime now = LocalTime.now();
		int h = now.getHour();
		int m = now.getMinute();
		int s = now.getSecond();
		
		return new int[]{h,m,s};
	}
	
	public static void main(String[] args) {
		Turtle t = new Turtle();
		
		t.penColor("gray1");
		t.left(90);
		for(int i = 0; i < 12; i++) {
			t.forward(150);
			t.backward(150);
			t.right(30);
		}
		
		t.penColor("red");
		t.right(getTime()[0]*30);
		t.forward(50);
		t.backward(50);
		t.left(getTime()[0]*30);
		
		t.penColor("blue");
		t.right(getTime()[1] * 6);
		t.forward(120);
		t.backward(120);
		t.left(getTime()[1] * 6);
		
		t.penColor("green");
		t.right(getTime()[2]*6);
		t.forward(150);
		t.backward(150);
		
	}

}

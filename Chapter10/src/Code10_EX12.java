import java.time.LocalTime;

public class Code10_EX12 {
	static int[] getTime() {
		LocalTime now = LocalTime.now();
		int h, m, s;
		
		h = now.getHour();
		m = now.getMinute();
		s = now.getSecond();
		
		return new int[]{h,m,s};
	}
	
	public static void main(String[] args) {		
		Turtle turtle = new Turtle();
		turtle.speed(50);
		turtle.outlineColor("white");
		
		turtle.left(90);
		turtle.penColor("gray");
		for(int i = 0; i < 12; i++) {
			turtle.forward(150);
			turtle.backward(150);
			turtle.right(30);
		}

		System.out.printf("현재 시간: %d시 %d분 %d초\n", getTime()[0], getTime()[1], getTime()[2]);
		
		turtle.width(13);
		turtle.penColor("red");
		turtle.right(getTime()[0] * 30);
		turtle.forward(90);
		turtle.backward(90);
		turtle.left(getTime()[0] * 30);
		
		turtle.width(8);
		turtle.penColor("blue");
		turtle.right(getTime()[1] * 6);
		turtle.forward(140);
		turtle.backward(140);
		turtle.left(getTime()[1] * 6);
		
		turtle.width(4);
		turtle.penColor("green");
		turtle.right(getTime()[2] * 6);
		turtle.forward(180);
		
	}

}

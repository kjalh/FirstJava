package pppp;

class Draw2 {
	Turtle t;
	
	Draw2(Turtle turtle){
		t = turtle;
	}
	public void Line(int x1, int y1, int x2, int y2) {
		t.setPosition(x1,y1);
		t.down();
		t.setPosition(x2, y2);
		t.stamp();
		t.up();
	}
	public void square(int x1, int y1, int x2, int y2) {
			t.setPosition(x1, y1);
			t.down();
			t.setPosition(x2, y1);
			t.setPosition(x2, y2);
			t.setPosition(x1, y2);
			t.setPosition(x1, y1);
			t.stamp();
			t.up();	
	}
}

public class C08_11_02 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		Draw2 draw2 = new Draw2(t);
		String[] color = {"red", "yellow", "black", "blue", "magenta", "orange", "green"};
		t.setCanvasSize(500, 500);
		
		while(true) {
			
			int x1 = (int)(Math.random()*400-200);
			int y1 = (int)(Math.random()*400-200);
			int x2 = (int)(Math.random()*400-200);
			int y2 = (int)(Math.random()*400-200);
			String c = color[(int)(Math.random()*color.length)];
			
			t.speed(500);
			
			t.up();
			if(Math.random()<0.5) {
				t.fillColor(c);
				t.penColor(c);
				draw2.Line(x1,y1,x2,y2);
			}
			else {
				t.fillColor(c);
				t.penColor(c);
				draw2.square(x1,y1,x2,y2);
			}	
		}
	}
}

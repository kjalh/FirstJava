package pppp;

class Draw3 {
	Turtle t;
	Draw3(Turtle turtle){
		t = turtle;
	}
	
	void Line(int x1, int y1, int x2, int y2) {
		t.up();
		t.setPosition(x1, y1);
		t.down();
		t.setPosition(x2, y2);
		t.stamp();
	}
	void square(int x1, int y1, int x2, int y2) {
		t.up();
		t.setPosition(x1, y1);
		t.down();
		t.setPosition(x2, y1);
		t.setPosition(x2, y2);
		t.setPosition(x1, y2);
		t.setPosition(x1, y1);
		t.stamp();
	}
	
}

public class C08_11_03 {

	public static void main(String[] args) {
		Turtle t = new Turtle();		
		Draw3 draw = new Draw3(t);
		
		String[] color = {"red", "yellow", "black", "blue", "magenta", "orange", "green"};
		
		while(true) {
			int x1 = (int)(Math.random()*500-250);
			int x2 = (int)(Math.random()*500-250);
			int y1 = (int)(Math.random()*500-250);
			int y2 = (int)(Math.random()*500-250);
			String c = color[(int)(Math.random()*color.length)];
			
			t.penColor(c);
			t.fillColor(c);
			t.outlineColor(c);
			
			if(Math.random()<0.5) {
				draw.Line(x1, y1, x2, y2);
			}
			else
				draw.square(x1, y1, x2, y2);
		}
		
	}

}

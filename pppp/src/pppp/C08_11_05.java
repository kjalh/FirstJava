package pppp;

class Draw5{
	Turtle t;
	Draw5(Turtle turtle){
		t = turtle;
	}
	
	void draw(int x1, int y1, int x2, int y2, String color) {
		t.up();
		t.setPosition(x1,  y1);
		t.fillColor(color);
		t.outlineColor(color);
		t.penColor(color);
		
		if(Math.random()<0.5) {
			t.down();
			t.setPosition(x2, y2);
			t.stamp();
		}
		else {
			t.down();
			t.setPosition(x2, y1);
			t.setPosition(x2, y2);
			t.setPosition(x1, y2);
			t.setPosition(x1, y1);
			t.stamp();
		}
		
	}

}

public class C08_11_05 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		Draw5 draw = new Draw5(t);
		String[] c = {"red", "yellow", "orange", "blue", "green", "magenta","black"};
		
		while(true) {
			int x1 = (int)(Math.random()*500-250);
			int y1 = (int)(Math.random()*500-250);
			int x2 = (int)(Math.random()*500-250);
			int y2 = (int)(Math.random()*500-250);
			
			String color = c[(int)(Math.random()*c.length)];
			
			draw.draw(x1, y1, x2, y2, color);
			
		}
		
		
	}

}

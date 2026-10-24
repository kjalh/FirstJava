package pppp;


class Draw4 {
	Turtle t;
	Draw4(Turtle turtle){
		t = turtle;
	}
	
	void paint(int x1, int y1, int x2, int y2) {
		t.up();
		t.setPosition(x1, y1);
		t.down();
		
		if(Math.random()<0.5) {
			t.setPosition(x2, y2);
			t.stamp();
		}
		else {
			t.setPosition(x2, y1);
			t.setPosition(x2, y2);
			t.setPosition(x1, y2);
			t.setPosition(x1, y1);
			t.stamp();
		}
		
		
		
	}
	
}

public class C08_11_04 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		Draw4 d = new Draw4(t);
		String[] c =  {"red", "orange", "green", "blue", "yellow", "black", "magenta"}; 
		t.speed(500);
		
		while(true) {
			int x1 = (int)(Math.random()*500-250);
			int y1 = (int)(Math.random()*500-250);
			int x2 = (int)(Math.random()*500-250);
			int y2 = (int)(Math.random()*500-250);
			
			String color = c[(int)(Math.random()*c.length)];
			
			t.fillColor(color);
			t.penColor(color);
			t.outlineColor(color);
			
			d.paint(x1, y1, x2, y2);			
		}
	}

}

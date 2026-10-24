package pppp;

class Draw7{
	Turtle t;
	Draw7(Turtle turtle){
		t = turtle;
	}
	public void paint(int x1, int y1, int x2, int y2, String color) {
		t.up();
		t.setPosition(x1, y1);
		t.down();
		t.penColor(color);
		t.fillColor(color);
		
		if(Math.random()<0.5)
			t.setPosition(x2, y2);
		else {
			t.setPosition(x2, y1);
			t.setPosition(x2, y2);
			t.setPosition(x1, y2);
			t.setPosition(x1, y1);	
		}
		t.stamp();
		
		
	}
	
}

public class C08_11_07 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		Draw7 draw = new Draw7(t);
		String c[] = {"red", "blue", "green", "orange", "yellow", "black", "magenta"};
		
		while(true) {
			int x1 = (int)(Math.random()*500-250);
			int x2 = (int)(Math.random()*500-250);
			int y1 = (int)(Math.random()*500-250);
			int y2 = (int)(Math.random()*500-250);
			
			String color = c[(int)(Math.random()*c.length)];
			
			draw.paint(x1, y1, x2, y2, color);
		}
		
		
		
	}

}

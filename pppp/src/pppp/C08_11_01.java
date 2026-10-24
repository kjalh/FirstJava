package pppp;

import java.awt.Color;

class draw{
	Turtle t;
	draw(){}
	draw(Turtle x){
		t = x;
	}
	
	void getdraw(int f1, int f2) {
		
		for(int i = 0; i < 4; i++) {
			t.forward(f1);
			t.left(90);
			t.forward(f2);
			t.left(90);
		}	
	}	
}

public class C08_11_01 {
	public static void main(String[] args) {
		Turtle t = new Turtle();
		draw d = new draw(t);
		
		for(int i = 0;  i < 10; i++) {
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			int f1 = (int)(Math.random()*500 -250);
			int f2 = (int)(Math.random()*500 -250);
			
			t.outlineColor(new Color(r,g,b));
			t.penColor(new Color(r,g,b));
			t.fillColor(new Color(r,g,b));
			
			t.setPosition(f1, f2);
			
			d.getdraw(f1, f2);
		}		
	}
}

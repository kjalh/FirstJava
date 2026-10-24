package pppp;

import java.awt.Color;

public class C09_12_04 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		int[][] draw = new int[50][5];
		t.setCanvasSize(600,600);
		
		for(int i = 0; i < draw.length; i++) {
			draw[i][0] = (int)(Math.random()*600-300);
			draw[i][1] = (int)(Math.random()*600-300);
			draw[i][2] = (int)(Math.random()*255);
			draw[i][3] = (int)(Math.random()*255);
			draw[i][4] = (int)(Math.random()*255);
			
			t.penColor(new Color(draw[i][2], draw[i][3], draw[i][4]));
			t.fillColor(new Color(draw[i][2], draw[i][3], draw[i][4]));
			t.setPosition(draw[i][0], draw[i][1]);
			t.stamp();
		}
	}

}

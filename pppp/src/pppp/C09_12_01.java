package pppp;

import java.awt.Color;

public class C09_12_01 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.setCanvasSize(600, 600);
		
		int[][] inform = new int[50][5];
		
		for(int i = 0; i < inform.length; i++) {
			inform[i][0] = (int)(Math.random()*600-300);
			inform[i][1] = (int)(Math.random()*600-300);
			inform[i][2] = (int)(Math.random()*255);
			inform[i][3] = (int)(Math.random()*255);
			inform[i][4] = (int)(Math.random()*255);
			
			t.stamp();	
			t.fillColor(new Color(inform[i][2], inform[i][3], inform[i][4]));
			t.penColor(new Color(inform[i][2], inform[i][3], inform[i][4]));
			t.setPosition(inform[i][0], inform[i][1]);	
		}

	}

}

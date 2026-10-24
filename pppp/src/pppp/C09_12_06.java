package pppp;

import java.awt.Color;

public class C09_12_06 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		
		int[][] ary = new int[50][5];
	
		for(int i = 0; i < 50; i++) {
			ary[i][0] = (int)(Math.random()*600-300);
			ary[i][1] = (int)(Math.random()*600-300);
			ary[i][2] = (int)(Math.random()*255);
			ary[i][3] = (int)(Math.random()*255);
			ary[i][4] = (int)(Math.random()*225);
		}
		
		for(int i = 0; i < 50; i++) {
			t.setPosition(ary[i][0], ary[i][1]);
			t.penColor(new Color(ary[i][2], ary[i][3], ary[i][4]));
			t.fillColor(new Color(ary[i][2], ary[i][3], ary[i][4]));
			t.stamp();
		}
		
	}
}

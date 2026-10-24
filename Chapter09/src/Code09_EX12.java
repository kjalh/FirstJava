import java.awt.Color;
public class Code09_EX12 {

	public static void main(String[] args) {
		int TURTLE_NUMBER = 50;
		
		Turtle t = new Turtle();
		t.speed(100);
		t.setCanvasSize(600, 600);
		
		int[][] turtleAry = new int[TURTLE_NUMBER][5];
		
		for(int i=0; i<TURTLE_NUMBER; i++) {
			turtleAry[i][0] = (int)(Math.random()*600-300);
			turtleAry[i][1] = (int)(Math.random()*600-300);
			turtleAry[i][2] = (int)(Math.random()*256);
			turtleAry[i][3] = (int)(Math.random()*256);
			turtleAry[i][4] = (int)(Math.random()*256);					
		}
		int x, y, r, g, b;
		for(int i=0; i<TURTLE_NUMBER; i++) {
			x = turtleAry[i][0];
			y = turtleAry[i][1];
			r = turtleAry[i][2];
			g = turtleAry[i][3];
			b = turtleAry[i][4];
			
			t.fillColor(new Color(r,g,b));
			t.penColor(new Color(r,g, b));
			
			t.down();
			t.setPosition(x, y);
			t.stamp();
		}		
	}

}

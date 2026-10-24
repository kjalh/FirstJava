import java.awt.Color;
public class Code09_실전예제1 {

	public static void main(String[] args) {
		int TURTLE_NUMBER = 50;
		int WIDTH = 500, HEIGHT = 500;
		
		Turtle t = new Turtle();
		t.speed(100);
		t.outlineColor("white");
		t.setCanvasSize(WIDTH + 100, HEIGHT + 100);
		
		int[][] turtleAry = new int[TURTLE_NUMBER][6];
		
		for(int i=0; i<TURTLE_NUMBER; i++) {
			turtleAry[i][0] = (int)(Math.random()*WIDTH - WIDTH/2);
			turtleAry[i][1] = (int)(Math.random()*HEIGHT - HEIGHT/2);
			turtleAry[i][2] = (int)(Math.random()*100);
			turtleAry[i][3] = (int)(Math.random()*256);//r
			turtleAry[i][4] = (int)(Math.random()*256);//g
			turtleAry[i][5] = (int)(Math.random()*256);//b					
		}
		int x, y, size, r, g, b;
		for(int i=0; i<TURTLE_NUMBER; i++) {
			x = turtleAry[i][0];
			y = turtleAry[i][1];
			size = turtleAry[i][2];
			r = turtleAry[i][3];
			g = turtleAry[i][4];
			b = turtleAry[i][5];
			
			t.fillColor(new Color(r,g,b));
			t.penColor(new Color(r,g, b));
			
			t.shapeSize(size, size);
			t.down();
			t.setPosition(x, y);
			t.stamp();
			
			t.up();
			t.setPosition(0, 0);
			
		}
		
		

	}

}

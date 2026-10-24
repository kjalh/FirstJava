abstract class Figure{
	Turtle turtle;
	String color;
	public int x1, y1, x2, y2;
	abstract public void DrawLine();
	abstract public void DrawSquare();
}
class Draw extends Figure{
	public Draw(Turtle turtle, String color, int x1, int y1, int x2, int y2) {
		this.turtle = turtle;
		this.color = color;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void DrawLine() {

		turtle.setPosition(x1, y1);
		turtle.penColor(color);
		turtle.fillColor(color);
		turtle.down();
		turtle.stamp();
		turtle.setPosition(x2,  y2);
	}
	public void DrawSquare() {

		turtle.setPosition(x1, y1);
		
		turtle.penColor(color);
		turtle.fillColor(color);
		turtle.down();
		turtle.setPosition(x1,  y2);
		turtle.setPosition(x2,  y2);
		turtle.setPosition(x2,  y1);
		turtle.setPosition(x1,  y1);
		turtle.stamp();
	}
}

public class Code08_EX11 {

	public static void main(String[] args) {
		Turtle turtle = new Turtle();
		Draw draw;
		String[] colorStr = {"red", "green", "blue", "black", "magenta", "orange", "gray"};
		
		turtle.speed(500);
		
		while(true) {
			String color = colorStr[(int)(Math.random()*colorStr.length)];
			
			int x1 = (int)(Math.random()*500-250);
			int y1 = (int)(Math.random()*500-250);
			int x2 = (int)(Math.random()*500-250);
			int y2 = (int)(Math.random()*500-250);
			
			turtle.up();
			
			draw = new Draw(turtle, color, x1, y1, x2, y2);
			if(Math.random()<0.5) {
				draw.DrawLine();
			}
			else {
				draw.DrawSquare();
			}
		}

	}

}

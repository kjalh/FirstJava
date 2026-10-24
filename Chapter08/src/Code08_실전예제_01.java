/*abstract class Figure{
	Turtle turtle;
	String color;
	public int x1, y1, x2, y2;
	abstract public void DrawLine();
}
class Line extends Figure{
	public Line(Turtle turtle, String color, int x1, int y1, int x2, int y2) {
		this.turtle = turtle;
		this.color = color;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void DrawLine() {
		turtle.up();
		turtle.setPosition(x1, y1);
		turtle.penColor(color);
		turtle.down();
		turtle.setPosition(x2,  y2);
	}
}
class Rectangle extends Figure{
	public Rectangle(Turtle turtle, String color, int x1, int y1, int x2, int y2) {
		this.turtle = turtle;
		this.color = color;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void DrawLine() {
		turtle.up();
		turtle.setPosition(x1, y1);
		
		turtle.penColor(color);
		turtle.down();
		turtle.setPosition(x1,  y2);
		turtle.setPosition(x2,  y2);
		turtle.setPosition(x2,  y1);
		turtle.setPosition(x1,  y1);
	}
}*/
public class Code08_실전예제_01 {

	public static void main(String[] args) {
		Turtle turtle = new Turtle();
		Line line;
		Rectangle rect;
		String[] colorStr = {"red", "green", "blue", "black", "magenta", "orange", "gray"};
		
		turtle.speed(500);
		
		int x1, y1, x2, y2;
		
		while(true) {
			int colorNum = (int)(Math.random()*colorStr.length);
			String color = colorStr[colorNum];
			
			x1 = (int)(Math.random()*500-250);
			y1 = (int)(Math.random()*500-250);
			x2 = (int)(Math.random()*500-250);
			y2 = (int)(Math.random()*500-250);
			
			if(Math.random()<0.5) {
				line = new Line(turtle, color, x1, y1, x2, y2);
				line.DrawLine();
			}
			else {
				rect = new Rectangle(turtle, color, x1, y1, x2, y2);
				rect.DrawLine();
			}
		}
	}

}

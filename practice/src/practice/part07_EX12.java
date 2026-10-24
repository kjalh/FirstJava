package practice;
class Rabbit1{
	Rabbit1(Turtle turtle, String shape, int size, int angle, String color, int x, int y){
		turtle.fillColor(color);
		turtle.penColor(color);
		turtle.shape(shape);
		turtle.left(angle);
		turtle.setPosition(x, y);
		turtle.shapeSize(size, size);
		
		System.out.println("**토끼, 거북이 1쌍이 만들어졌습니다. **");
	}
}
public class part07_EX12 {

	public static void main(String[] args) {
		String[] colorStr = {"red", "green", "blue", "black", "magenta", "orange", "gray"};
		String[] shapeStr = {"turtle", "triangle", "circle", "square", "arrow"};
		
		Turtle turtle = new Turtle();
		turtle.speed(500);
		turtle.setCanvasSize(550, 550);
		
		for(int i=0; i<20;i++) {
			int colorNum = (int)(Math.random()*colorStr.length);
			String color = colorStr[colorNum];
			int shapeNum = (int)(Math.random()*shapeStr.length);
			String shape = shapeStr[shapeNum];
			int size = (int)(Math.random()*100);
			int angle = (int)(Math.random()*360);
			int x = (int)(Math.random()*500-250);
			int y = (int)(Math.random()*500-250);
			turtle = new Turtle();
			new Rabbit1(turtle, shape, size, angle, color, x, y);
			
			
		}
		

	}

}

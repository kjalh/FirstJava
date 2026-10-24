import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Code11_EX12 {

	public static void main(String[] args) throws Exception{
		Turtle turtle = new Turtle();
		FileWriter fw = new FileWriter("C:/FirstJava/turtle.txt");
		String outStr;
		
		String[] colorStr = {"red","green","blue", "black","magenta", "oragne", "gray"};
		turtle.speed(10);
		int x,y,size, angle;
		String color;
		
		turtle.setCanvasSize(500, 500);
		
		turtle.up();
		
		for(int i=0; i<50; i++) {
			int colorNum = (int)(Math.random()*colorStr.length);
			color = colorStr[colorNum];
			size = (int)(Math.random()*101);
			x = (int)(Math.random() * 500-250);
			y = (int)(Math.random() * 500-250);
			angle = (int)(Math.random()*360+1);

			turtle.fillColor(color);
			turtle.setPosition(x,y);
			turtle.stamp();
			turtle.shapeSize(size, size);
			turtle.left(angle);
			
			outStr = color + "," + size + "," + x + "," + y + "," + angle;
			fw.write(outStr + "\n");
		}
		fw.close();
	}

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Code11_실전예제 {

	public static void main(String[] args) throws Exception{
		Turtle turtle = new Turtle();
		FileWriter fw = new FileWriter("C:/FirstJava/turtleTrace.txt");
		String outStr;
		
		String[] colorStr = {"red","green","blue", "black","magenta", "oragne", "gray"};
		turtle.speed(500);
		int x,y;
		String color;
		
		for(int i=0; i<30; i++) {
			int colorNum = (int)(Math.random()*colorStr.length);
			color = colorStr[colorNum];
			x = (int)(Math.random() * 500-250);
			y = (int)(Math.random() * 500-250);
			
			turtle.penColor(color);
			turtle.setPosition(x,y);
			
			outStr = x + "," + y + "," + color;
			fw.write(outStr + "\n");
		}
		turtle.clear();
		fw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("C:/FirstJava/turtleTrace.txt"));
		String inStr;
		String[] xyColor;
		while(true) {
			inStr = br.readLine();
			if(inStr == null) 
				break;
			
			xyColor = inStr.split(",");
			x = Integer.parseInt(xyColor[0]);
			y = Integer.parseInt(xyColor[1]);
			color = xyColor[2];
			
			turtle.penColor(color);
			turtle.setPosition(x,y);
		}
		
		
	}

}

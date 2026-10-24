package pppp;

import java.awt.font.TextAttribute;
import java.io.FileWriter;

public class C11_12_03 {

	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("C:/FirstJava/C11_12_03.txt");
		Turtle t = new Turtle();
		
		String color[] = {"red","blue", "yellow", "orange", "black", "green", "magenta"};
		
		t.up();
		
		for(int i = 0; i<50; i++) {
			String c = color[(int)(Math.random()*color.length)];
			int size = (int)(Math.random()*90+10);
			int x = (int)(Math.random()*500-250);
			int y = (int)(Math.random()*500-250);
			int angle = (int)(Math.random()*360);
			
			
			t.fillColor(c);
			t.shapeSize(size, size);
			t.setPosition(x,y);
			t.left(angle);
			t.stamp();
			
			fw.write(i+1 +"행 색깔은 "+c + ", size: " + size+", x: "+x+", y: "+y+", angle: "+ angle+"\n");
		}
		
		fw.close();
	}

}

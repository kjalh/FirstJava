package pppp;

import java.io.FileWriter;

public class C11_12_01 {

	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("c:/FirstJava/C11_12_01.txt");
		Turtle t = new Turtle();
		int j= 0;
		String[] arycolor = {"red","blue","green","magenta", "black","orange","yellow"};
		
		t.setCanvasSize(500, 500);
		
		for(int i = 0; i < 50; i++) {
			String color = arycolor[(int)(Math.random()*arycolor.length)];
			int size = (int)(Math.random()*90+10);
			int x = (int)(Math.random()*500-250);
			int y = (int)(Math.random()*500-250);		
			int angle = (int)(Math.random()*360);
			
			t.up();
			t.setPosition(x, y);
			t.shapeSize(size, size);
			t.fillColor(color);
			t.left(angle);
			t.stamp();
			
			j++;
			fw.write(j + "행: " + color + ", " + size + ", " + x + ", " + y + ", " + angle + "\n");	
			System.out.print(j + "행: " + color + ", " + size + ", " + x + ", " + y + ", " + angle + "\n");	
		}
		fw.close();
			
	}

}

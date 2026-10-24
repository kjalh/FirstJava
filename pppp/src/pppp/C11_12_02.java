package pppp;

import java.io.FileWriter;

public class C11_12_02 {

	public static void main(String[] args) throws Exception{
		Turtle t = new Turtle();
		FileWriter fw = new FileWriter("c:/FirstJava/C11_12_02.txt");
		String[] color = {"red","green","blue","orange","magenta","yellow","black"};
		
		t.setCanvasSize(500, 500);
		t.up();
		
		for(int i = 0; i < 50; i++) {
			int x = (int)(Math.random()*500-250);
			int y = (int)(Math.random()*500-250);
			int size = (int)(Math.random()*101);
			int angle = (int)(Math.random()*360);
			String c = color[(int)(Math.random()*color.length)];
			
			t.shapeSize(size,size);
			t.setPosition(x, y);
			t.left(angle);
			t.fillColor(c);
			t.stamp();
			
			fw.write("색은 " + c + ", 크기는 " + size + ", X좌표는 " + x + ", Y좌표는 " + y + ", 각도는 " + angle +"\n");
		}
		
		fw.close();
	}
}

package pppp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class C11_12_05 {

	public static void main(String[] args) throws Exception{
		Turtle t = new Turtle();
		String[] c = {"red", "yellow", "orange", "black", "blue", "green", "magenta"};
		
		FileWriter fw = new FileWriter("c:/FirstJava/C11_12_05.txt");
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/C11_12_05.txt"));
		
		for(int i = 0; i < 50; i++) {
			String color = c[(int)(Math.random()*c.length)];
			int size = (int)(Math.random()*101);
			int x = (int)(Math.random()*500-250);
			int y = (int)(Math.random()*500-250);
			int angle = (int)(Math.random()*360);
			
			fw.write(color + ", " + size + ", " + x + ", " + y + ", " + angle + "\n");
			
		}
		fw.close();
		
		String[] s;
		String q;
		while(true) {
			
			q = br.readLine();
			
			if(q == null)
				break;
			
			s = q.split(", ");
			
			String reColor = s[0];
			int reSize = Integer.parseInt(s[1]);
			int reX = Integer.parseInt(s[2]);
			int reY = Integer.parseInt(s[3]);
			int reangle = Integer.parseInt(s[4]);
			
			t.up();
			
			t.fillColor(reColor);
			t.shapeSize(reSize, reSize);
			t.setPosition(reX, reY);
			t.left(reangle);
			t.stamp();
		}
		
		
		
		
	}

}

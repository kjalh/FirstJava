package pppp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class C11_12_06 {

	public static void main(String[] args) throws Exception{
		Turtle t = new Turtle();
		
		FileWriter fw = new FileWriter("c:/FirstJava/C11_12_06.txt");
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/C11_12_06.txt"));
		String[] c = {"red", "orange", "blue", "green", "black", "magenta", "yellow"};
		
		for(int i = 0; i < 50; i++) {
			String color = c[(int)(Math.random()*c.length)];
			int size = (int)(Math.random()*101);
			int x = (int)(Math.random()*500-250);
			int y = (int)(Math.random()*500-250);
			int angle = (int)(Math.random()*360);
			
			fw.write(color + ", "+ size + ", " + x + ", " + y + ", " + angle + "\n");
			
		}
		
		fw.close();
		
		String r;
		String[] re;
		int i =1;
		
		t.up();
		while(true) {
			r = br.readLine();
			
			if(r == null)
				break;
			
			re = r.split(", ");
			
			String reColor = re[0];
			int reSize = Integer.parseInt(re[1]);
			int reX = Integer.parseInt(re[2]);
			int reY = Integer.parseInt(re[3]);
			int reAngle = Integer.parseInt(re[4]);
			
			t.fillColor(reColor);
			t.shapeSize(reSize, reSize);
			t.setPosition(reX, reY);
			t.left(reAngle);
			t.stamp();
			
			System.out.println(i);
			i++;
		}
		
	}

}

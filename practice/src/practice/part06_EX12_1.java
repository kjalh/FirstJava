package practice;
import java.awt.Color;
import java.util.Random;
public class part06_EX12_1 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		int i, j = 0;
//		int R,G,B;
		String C[] = {"red", "green","yellow", "blue", "magenta","orange","black"};
		int R = 0;
		for(i=0; i<50; i++) {
			
			Random rand = new Random();

	        
	        float r = rand.nextFloat();
	        float g = rand.nextFloat();
	        float b = rand.nextFloat();

	       
	        Color randomColor = new Color(r, g, b);
			
			R = (int)(Math.random()*7);
						
			t.penColor(randomColor);
			t.left(90);
			t.forward(j);
			j+=10;
		}
		

	}

}

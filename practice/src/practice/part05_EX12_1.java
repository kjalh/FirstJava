package practice;

public class part05_EX12_1 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.setCanvasSize(300, 300);
		
		int x, y, a;
		int rx, ry;
		String[] C = {"blue", "green", "orange", "red"};
		int i = 0;
		
		while(true) {
			x = (int)(Math.random()*90+10);
			a = (int)(Math.random()*360);
				
			t.penColor(C[i]);
			
			t.left(a);
			t.forward(x);
			
			rx = (int)t.getX();
			ry = (int)t.getY();
			
			if((150<rx)||(rx<-150) && (150<ry) || (ry<-150) ) {
				t.setPosition(0, 0);
				i++;
			}
			else;
			
			if(i==4)
				i = 0;
			
		}
		

		
		
		
		

	}

}

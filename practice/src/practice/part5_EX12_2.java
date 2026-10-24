package practice;

public class part5_EX12_2 {

	public static void main(String[] args) {
		Turtle t = new Turtle();		
		t.setCanvasSize(300, 300);
		String C[] = {"blue", "green", "orange", "red"};
		int angle;
		int move;
		int i = 0;
		int x, y;
		
		while(true) {
			angle = (int)(Math.random()*360);
			move = (int)(Math.random()*90+10);
					
			t.penColor(C[i]);
			t.forward(move);
			t.left(angle);
			
			x = (int)(t.getX());
			y = (int)(t.getY());
			
			if((x>150 || x<-150) && (y>150 || y<-150)) {
				t.setPosition(0, 0);
				i++;
			}
			else;
			
			if(i==4)
				i=0;
			
			
		}
		

	}

}

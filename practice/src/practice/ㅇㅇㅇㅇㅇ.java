package practice;

public class ㅇㅇㅇㅇㅇ {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.setCanvasSize(300,300);
		String[] C = {"blue", "green", "orange", "red"};
		int i = 0;
		int gx, gy;
		int f, angle;
		
		while(true) {
			f = (int)(Math.random()*90+10);
			angle = (int)(Math.random()*360+10);
			t.penColor(C[i]);
			t.forward(f);
			t.left(angle);
			
			gx = (int)t.getX();
			gy = (int)t.getY();
			
			//방법 1
			/*
			if((-150<gx && gx<150) && (-150<gy && gy<150));
			else {
				t.setPosition(0, 0);
				i++;
			}
			if(i == 4)
				i=0;
			*/
			
			//방법 2
			
			if((150<gx || gx<-150) || (150<gy || gy <-150)) {
				t.setPosition(0,0);
				i++;
			}
			if(i==4)
				i=0;
				
		}
		
		
			
	}

}


public class Code05_EX12 {

	public static void main(String[] args) {
		Turtle turtle = new Turtle();
		int angle, distance, curX, curY;
		
		String C[] = {"blue", "green", "orange", "red"};
		
		int i=0;
		
		turtle.speed(100);
		turtle.setCanvasSize(300,300);
		turtle.width(5);

		
		
		while(true) {
			
			if(i==4) {
				i=0;
			}
			turtle.penColor(C[i]);
			
			angle = (int)(Math.random()*360);
			distance = (int)(Math.random()*90+10);
			
			
					
			turtle.right(angle);
			turtle.forward(distance);	
			
			curX = (int)turtle.getX();
			curY = (int)turtle.getY();
			
			if((curX >= -150 && curX <=150)&&(curY>=-150 && curY <= 150)) {
				System.out.println("Good Boy~");
			}
				
			else {
				turtle.setPosition(0,0);
				i++;
			}
				
		}

	}

}


public class Code06_EX12 {

	public static void main(String[] args) {
		Turtle turtle = new Turtle();
		
		String C[] = {"blue", "black", "red", "magenta", "yellow", "green", "orange"};
		
		int j=0;
			
		for(int i = 0; i<50; i++) {
			//int r = (int)(Math.random()*7);
			
			turtle.penColor(C[(int)(Math.random()*7)]);	
			//turtle.penColor(C[r]);	
			
			//(int)(Math.random()*C.length);를 사용해도 됨
			
			turtle.left(90);
			turtle.forward(j);
			
			j+=10;	
		}

	}

}

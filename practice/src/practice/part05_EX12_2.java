package practice;

public class part05_EX12_2 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		String C[] = {"red", "yellow", "orange", "black", "blue", "magenta", "green"};
		int r;
		int f = 0;
		
		for(int i=0; i<50; i++) {
			
			r = (int)(Math.random()*C.length);
			
			t.penColor(C[r]);
			t.left(90);
			t.forward(f);
			f+=10;
		}
		
		
		
	}

}

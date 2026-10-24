package practice;

public class part06_EX12_2 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		int j=0;
		String C[] = {"black","magenta","yellow","red","blue", "orange", "green"};
		
		for(int i=0;i<50;i++) {
			int a = (int)(Math.random()*C.length);
			t.penColor(C[a]);
			t.left(90);
			t.forward(j);
			j+=10;
			
		}
	}

}

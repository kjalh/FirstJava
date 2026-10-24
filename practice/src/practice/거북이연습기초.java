package practice;

public class 거북이연습기초 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
			
		String[] a = {"magenta", "yellow"};
		String[] b = {"square", "triangle"};
		
		t.shape("circle");
		
		t.left(90);
		t.penColor("blue");
		t.forward(100);
		t.fillColor("black");
		t.stamp();
		t.fillColor(a[1]);
		
		t.penColor(a[0]);
		t.forward(100);
		
		t.shape(b[1]);
	}

}

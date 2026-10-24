class Shape05{
	public Shape05 next;
	public Shape05() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line05 extends Shape05{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect05 extends Shape05{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle05 extends Shape05{
	public void draw() {
		System.out.println("Circle");
	}
}

public class Code05_05 {
	static void paint(Shape05 p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line05 line = new Line05();
		
		paint(line);
		paint(new Shape05());
		paint(new Line05());
		paint(new Rect05());
		paint(new Circle05());

	}

}

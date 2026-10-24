interface Shape13 {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
class Circle13 implements Shape13{
	int radius;
	
	public Circle13(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	
	public double getArea() {
		return Shape14.PI * radius * radius;
	}
}
public class Code05_EX13 {

	public static void main(String[] args) {
		Shape13 donut = new Circle13(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());

	}

}

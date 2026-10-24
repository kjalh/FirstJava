interface Shape14 {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
class Circle14 implements Shape14 {
	int radius;
	
	public Circle14(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
		
	}
	@Override
	public double getArea() {
		return Shape14.PI * radius * radius ;
	}
}
class Oval14 implements Shape14 {
	int width, height;
	
	public Oval14(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	@Override
	public void draw() {
		System.out.printf("%dx%d에 내접하는 타원입니다.\n", width, height);	
	}

	@Override
	public double getArea() {		
		return Shape14.PI * width * height;
	}
}

class Rect14 implements Shape14{
	int width, height;
	
	public Rect14(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.printf("%dx%d 크기의 사각형 입니다.\n", width, height);	
	}

	@Override
	public double getArea() {
		return width * height;
	}	
}


public class Code05_EX14 {

	public static void main(String[] args) {
		Shape14 [] list = new Shape14[3];
		list[0] = new Circle14(10);
		list[1] = new Oval14(20, 30);
		list[2] = new Rect14(10, 40);
		
		for(int i = 0; i<list.length; i++) list[i].redraw();
		for(int i = 0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}

}

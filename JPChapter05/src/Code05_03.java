class Point03{
	private int x, y;
	public Point03() {
		this.x = this.y = 0;
	}
	public Point03(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
class ColorPoint03 extends Point03{
	private String color;
	public ColorPoint03(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
public class Code05_03 {

	public static void main(String[] args) {
		ColorPoint03 cp = new ColorPoint03(5, 6, "blue");
		cp.showColorPoint();

	}

}

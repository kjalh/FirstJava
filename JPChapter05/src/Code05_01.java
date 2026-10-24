class Point01{
	private int x, y;
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
class ColorPoint01 extends Point01{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
public class Code05_01 {

	public static void main(String[] args) {
		Point01 p = new Point01();
		p.set(3,  4);
		p.showPoint();
		
		ColorPoint01 cp = new ColorPoint01();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}

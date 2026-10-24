class Point05{
	protected int x;
	protected int y;
	protected String color;
}
class ColorPoint05 extends Point05{
	
	public ColorPoint05(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color + "색의 (" + x + ", " +  y + ")의 점";
	}
	
}
public class Code05_EX05 {

	public static void main(String[] args) {
		ColorPoint05 cp = new ColorPoint05(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");

	}

}

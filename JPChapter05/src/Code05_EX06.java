class Point06{
	protected int x;
	protected int y;
	protected String color;
}
class ColorPoint06 extends Point06{
	
	public ColorPoint06() {
		this.x = 0;
		this.y = 0;
		this.color = "BLACK";
	}
	
	public ColorPoint06(int x, int y) {
		this.x = x;
		this.y = y;
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
public class Code05_EX06 {

	public static void main(String[] args) {
		ColorPoint06 zeroPoint = new ColorPoint06();
		System.out.println(zeroPoint.toString()+ "입니다.");

		ColorPoint06 cp = new ColorPoint06(10, 10); 
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
		

	}

}

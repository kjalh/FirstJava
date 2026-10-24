class Point08{
	private int x, y;
	public Point08() {}
	public Point08(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	protected int gX() {return x;}
	protected int gY() {return y;}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}


class PositivePoint08 extends Point08{
	public PositivePoint08() {
		super();
	}
	
	public void move(int x, int y) {
		if (x >= 0 && y >= 0)
			super.move(x, y);
	}
	
	public PositivePoint08(int x, int y) {
		if (x >= 0 && y >= 0)
			super.move(x, y);
		else
			super.move(0, 0);
	}
		
	public String toString() {
		return "(" + gX() + ", " + gY() + ")의 점";
	}
}
public class Code05_EX08 {

	public static void main(String[] args) {
		PositivePoint08 p = new PositivePoint08();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");

		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");

		PositivePoint08 p2 = new PositivePoint08(-10, -10);

		System.out.println(p2.toString() + "입니다.");

	}

}

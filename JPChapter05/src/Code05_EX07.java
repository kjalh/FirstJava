class Point07{
	private int x, y;
	public Point07(int x, int y) {
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

class Point3D07 extends Point07{
	int z;
	public Point3D07(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public void moveUp() {
		++z;
	}
	public void moveDown() {
		--z;
	}
	public int gZ() {
		return z;
	}
	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	public String toString() {
		return  "(" + gX() + "," + gY() + "," + gZ() + ")의 점";
	}
}
public class Code05_EX07 {

	public static void main(String[] args) {
		Point3D07 p = new Point3D07(1,2,3);
		System.out.println(p.toString() + "입니다.");

		p.moveUp();
		System.out.println(p.toString() + "입니다.");

		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");

		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");

	}

}

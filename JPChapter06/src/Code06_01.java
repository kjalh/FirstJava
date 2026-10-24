class Point01{
	private int x, y;
	public Point01(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Code06_01 {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Point01 p = new Point01(2, 3);
		print(p);
	}

}

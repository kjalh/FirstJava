class Point03 {
	private int x, y;
	public Point03(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		Point03 p = (Point03)obj;
		if(x==p.x && y == p.y) return true;
		else return false;
	}
}

public class Code06_03 {

	public static void main(String[] args) {
		Point03 a = new Point03(2,3);
		Point03 b = new Point03(2,3);
		Point03 c = new Point03(2,3);
		
		if(a == b)
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		
	}

}

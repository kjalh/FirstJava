class MyPoint01{
	private int x, y;
	public MyPoint01(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Point(" + x + ", "+ y + ")";
	}
	public boolean equals(Object obj) {
		MyPoint01 p = (MyPoint01)obj;
		if(x==p.x && y == p.y) return true;
		else return false;
	}
	
	
}


public class Code06_EX01 {

	public static void main(String[] args) {
		MyPoint01 p = new MyPoint01(3, 50);
		MyPoint01 q = new MyPoint01(4, 50);
		
		System.out.println(p);
		
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

}

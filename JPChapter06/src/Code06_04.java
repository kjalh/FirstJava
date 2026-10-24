class Rect04{
	private int width;
	private int height;
	
	public Rect04(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		Rect04 p = (Rect04)obj;
		if (width*height == p.width*p.height)return true;
		else return false;
	}
	
}
public class Code06_04 {

	public static void main(String[] args) {
		Rect04 a = new Rect04(2,3);
		Rect04 b = new Rect04(3,2);
		Rect04 c = new Rect04(3,4);
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		if(b.equals(c)) System.out.println("b is equal to c");

	}

}

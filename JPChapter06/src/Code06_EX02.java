class Circle02{
	int x, y, radius;
	
	public Circle02(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle(" + x + ", " + y + ") 반지름 " + radius;
	}
	public boolean equals(Object a) {
		Circle02 c = (Circle02)a;
		
		if(x == c.x && y == c.y)
			return true;
		else 
			return false;
		
	}
	
}
public class Code06_EX02 {

	public static void main(String[] args) {
		Circle02 a = new Circle02(2, 3, 5);
		Circle02 b = new Circle02(2, 3, 50);
		
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
		
	}

}

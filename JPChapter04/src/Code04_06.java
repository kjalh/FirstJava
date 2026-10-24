
class Code04_06_1{
	int radius;
	public Code04_06_1(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class Code04_06 {

	public static void main(String[] args) {
		Code04_06_1[] c;
		c = new Code04_06_1[5];
		
		for(int i = 0; i<c.length; i++)
			c[i] = new Code04_06_1(i);
		
		for(int i = 0; i<c.length;i++)
			System.out.print((int)(c[i].getArea()) + " ");

	}

}

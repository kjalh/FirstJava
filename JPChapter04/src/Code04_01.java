
public class Code04_01 {
	int radius;
	String name;
	
	public Code04_01() {};
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Code04_01 pizza;
		pizza = new Code04_01();
		pizza.radius=10;
		pizza.name="자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Code04_01 donut = new Code04_01();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name="의 면적은 "+area);
	}

}


public class Code04_03 {
	int radius;
	String name;
	public Code04_03() {
		radius = 1; name = "";
	}
	public Code04_03(int r, String n) {
		radius = r; name =n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Code04_03 pizza = new Code04_03(10, "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+area);
		
		Code04_03 donut = new Code04_03();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);

	}

}

class Car{ 
	private String color;
	private int speed;
	
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	void upSpeed(int increase) {
		speed += increase;
	}
	void downSpeed(int decrease) {
		speed -= decrease;
	}
	String getcolor() {
		return color;
	}
	int getspeed() {
		return speed; 
	}
}
public class Code07_EX11 {

	public static void main(String[] args) {
		
		Car car1 = new Car("빨강", 30);
		Car car2 = new Car("파랑", 60);
		
		System.out.printf("자동차1의 색상은 [%s]이며, 현재 속도는 %dkm입니다.\n", car1.getcolor(), car1.getspeed());
		System.out.printf("자동차2의 색상은 [%s]이며, 현재 속도는 %dkm입니다.\n", car2.getcolor(), car2.getspeed());
	}

}

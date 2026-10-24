package practice;

/*class Car{
	private String color;
	private int speed;
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		
	}
	void upSpeed(int in) {
		speed += in;
	}
	void downspeed(int de) {
		speed -= de;
	}
	String getcolor(){
		return color;
	}
	int getspeed() {
		return speed;
	}
}*/



public class 객체연습11번 {

	public static void main(String[] args) {
		Car car1 = new Car("빨강", 30);
		
		System.out.printf("자동차1의 색생은 [%s]이며, 현재 속도는 %dkm입니다.", car1.getcolor(), car1.getspeed());

	}

}

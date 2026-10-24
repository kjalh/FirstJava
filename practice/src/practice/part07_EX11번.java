package practice;
class Car{
	
	String color;
	int speed;
	
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	void upSpeed(int in){
		speed+=in;
		
	}
	void downSpeed(int de){
		speed+=de;
	}
	
	String getcolor(){
		return color;
	}
	int getspeed() {
		return speed;
	}
}
public class part07_EX11번 {

	public static void main(String[] args) {

		Car car1 = new Car("빨강",30);
		Car car2 = new Car("파랑",60);
		System.out.printf("자동차의 색깔은 %s이며, 자동차 속도는 %dkm입니다.", car1.getcolor(), car1.getspeed());
		System.out.printf("자동차의 색깔은 %s이며, 자동차 속도는 %dkm입니다.", car2.getcolor(), car2.getspeed());
	}

}

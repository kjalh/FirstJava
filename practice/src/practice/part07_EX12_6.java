package practice;

class Car6{
	String color ="";
	int speed = 0;

	void upspeed(int in) {
		speed+=in;
	}
	void downspeed(int de) {
		speed-=de;
	}
	
}

public class part07_EX12_6 {

	public static void main(String[] args) {
		Car6 car = new Car6();
		
		car.color ="파랑";
		car.speed = 30;
		System.out.printf("자동차1의 색상은 %s이며, 속도는 %dkm입니다.\n", car.color, car.speed );

	}

}

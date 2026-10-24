package practice;

class Car4{
	
	String color = "";
	int speed = 0;
	
	void upSpeed(int in) {
		speed += in;
	}
	void downSpeed(int de) {
		speed -= de;
	}
	
}

public class part07_EX11_4 {

	public static void main(String[] args) {
		
		Car4 car = new Car4();
		car.color = "빨강";
		car.speed = 30;
		
		Car4 car2 = new Car4();
		car2.color = "파랑";
		car2.speed = 60;
		
		System.out.printf("자동차1의 색상은 %s이며, 현재 속도는 %dkm입니다.\n", car.color, car.speed);
		System.out.printf("자동차2의 색상은 %s이며, 현재 속도는 %dkm입니다.", car2.color, car2.speed);

	}

}

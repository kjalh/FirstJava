package practice;

import java.util.Scanner;

class Car5{
	String color = "";
	int speed = 0;
	
	void upSpeed(int in) {
		speed += in;
	}
	void downSpeed(int de) {
		speed -= de;
	}
}

public class part07_EX11_5 {

	public static void main(String[] args) {
		Car5 car = new Car5();
		Scanner s = new Scanner(System.in);
		
		car.color = "빨강";
		int a, b;
		
		System.out.print("1은 증가, 2는 감소 입력: ");
		a = s.nextInt();
		
		System.out.print("속도입력: ");
		b = s.nextInt();
		
		switch(a) {
		case 1:
			car.upSpeed(b);
			break;
		case 2:
			car.downSpeed(b);
			break;
		}
		
		System.out.printf("자동차의 색상은 %s이며, 현재 속도는 %dkm입니다.", car.color, car.speed);

	}

}

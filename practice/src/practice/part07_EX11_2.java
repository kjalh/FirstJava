package practice;

import java.util.Scanner;

class Car1{
	
	String color = "";
	int speed = 0;
	
	Car1(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	void upSpeed(int in){
		speed+=in;
		
	}
	void downSpeed(int de){
		speed-=de;
	}
	
	
}
public class part07_EX11_2 {

	public static void main(String[] args) {
		
		String c;
		int n = 0;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("자동차 색상을 입력: ");
		c = s.next();
		System.out.print("자동차 속도를 입력: ");
		n = s.nextInt();
		
		Car1 car1 = new Car1(c, n);
		
		System.out.printf("자동차의 색깔은 %s이며, 자동차 속도는 %dkm입니다.", car1.color, car1.speed);


	}

}

package practice;

import java.util.Scanner;

class Car2{
	
	String color = "";
	int speed = 0;
	
	Car2(String color, int speed){
		this.color= color;
		this.speed= speed;
	}
	
	void upSpeed(int in){
		speed+=in;
		
	}
	void downSpeed(int de){
		speed-=de;
		
	}
	
	
}

public class part07_EX11_3 {

	public static void main(String[] args) {
		String c;
		String id;
		int n = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("자동차 색상 입력: ");
		c = s.next();
		System.out.print("자동차 증가 or 감소: ");
		id = s.next();
		
		Car2 car1 = new Car2(c,0);
		
		System.out.print("자동차 속도 입력: ");
		n = s.nextInt();
		
		if(id.equals("증가"))
			car1.upSpeed(n);
		else if (id.equals("감소"))	
			car1.downSpeed(n);
		
		
		System.out.printf("자동차의 색깔은 %s이며, 자동차 속도는 %dkm입니다.", car1.color, car1.speed);

	}

}

/*import java.util.Scanner;

class Car{
	int speed = 0;
	
	void upSpeed(int value) {
		this.speed += value;
	}
}
class SchoolBus extends Car{
	void upSpeed(int value) {
		this.speed += value;
		if(this.speed > 60)
			this.speed = 60;
	}
}
class SportsCar extends Car{
	
}*/
public class Code08_LAB_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int axel;
		
		SchoolBus bus = new SchoolBus();
		SportsCar car = new SportsCar();
		
		while(true) {
			System.out.print("가속할 속도 ==> ");
			axel = s.nextInt();
			
			bus.upSpeed(axel);
			car.upSpeed(axel);
			
			System.out.printf("** 스쿨버스의 현재 속도: %d \n", bus.speed);
			System.out.printf("** 스포츠카의 현재 속도: %d \n", car.speed);
		}
	}

}

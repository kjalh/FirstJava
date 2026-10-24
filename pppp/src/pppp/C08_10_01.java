package pppp;

class AutoCar1{
	public int speed;
	
	int upSpeed(int sp) {
		speed = sp;
		return speed;
	}
}

class Sedan1 extends AutoCar1{
	int seatNum;
	
	int upSpeed(int sp) {
		speed = sp;
		return 0;
	}
	
	int getNum(){
		return seatNum;
	}
}

class Truck1 extends AutoCar1{
	int capacity;
	
	int upSpeed(int sp) {
		speed = sp;
		return speed;
	}
	int getCapacity(){
		return capacity;
	}
	
}

public class C08_10_01 {

	public static void main(String[] args) {
		
		Sedan1 sedan1 = new Sedan1();
		Truck1 truck1 = new Truck1();
		
		sedan1.upSpeed(300);
		truck1.upSpeed(100);
		
		sedan1.seatNum = 5;
		truck1.capacity = 50;
		
		System.out.println("승용자 속도는 " + sedan1.speed + "km, 좌석 수는 " + sedan1.getNum() + "개입니다.");
		System.out.println("트럭 속도는 " + truck1.speed + "km, 적재량은 " + truck1.getCapacity() + "톤입니다.");		
		
	}

}

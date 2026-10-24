package pppp;

class AutoCar5{
	int speed;
	
	void upSpeed(int s) {
		speed = s;
	}
	
}
class Sedan5 extends AutoCar5{
	int seatNum;
	int getNum() {
		return seatNum;
	}
	
}
class Truck5 extends AutoCar5{
	int capacity;
	int getCapacity() {
		return capacity;
	}
	
}

public class C08_10_05 {

	public static void main(String[] args) {
		Sedan5 sedan = new Sedan5();
		Truck5 truck = new Truck5();
		
		sedan.upSpeed(300);
		truck.upSpeed(100);
		
		sedan.seatNum = 5;
		truck.capacity = 50;
		
		System.out.println("승용자 속도는 " + sedan.speed + "km, 좌석 수는 " + sedan.getNum() + "개입니다.");
		System.out.println("트럭 속도는 " + truck.speed + "km, 적재량은 " + truck.getCapacity() + "톤입니다.");		
	}

}

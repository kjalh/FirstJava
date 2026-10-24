package pppp;

class AutoCar4{
	int speed;
	
	void upSpeed(int s) {
		speed = s;
	}
}

class Sedan4 extends AutoCar4{
	int seatNum;
	
	int getNum() {
		return seatNum;
	}
}

class Truck4 extends AutoCar4{
	int capacity;
	
	int getCapacity() {
		return capacity;
	}
}

public class C08_10_04 {

	public static void main(String[] args) {
			Sedan4 sedan = new Sedan4();
			Truck4 truck = new Truck4();
			
			sedan.upSpeed(300);
			truck.upSpeed(100);
			
			sedan.seatNum = 5;
			truck.capacity = 50;
			
			System.out.println("승용자 속도는 " + sedan.speed + "km, 좌석 수는 " + sedan.getNum() + "개입니다.");
			System.out.println("트럭 속도는 " + truck.speed + "km, 적재량은 " + truck.getCapacity() + "톤입니다.");	
		}

}

package pppp;

class AutoCar2{
	int speed;
	
	void upSpeed(int s) {
		speed = s;
	}
}

class Sedan2 extends AutoCar2{
	int seatNum;
	
	public int getNum() {
		return seatNum;
	}
}

class Truck2 extends AutoCar2{
	int capacity;
	public int getCapacity() {
		return capacity;
	}
}

public class C08_10_02 {

	public static void main(String[] args) {
		Sedan2 sedan2 = new Sedan2();
		Truck2 truck2 = new Truck2();
		
		sedan2.upSpeed(300);
		truck2.upSpeed(100);
		
		sedan2.seatNum = 5;
		truck2.capacity = 50;
		
		System.out.println("승용자 속도는 " + sedan2.speed + "km, 좌석 수는 " + sedan2.getNum() + "개입니다.");
		System.out.println("트럭 속도는 " + truck2.speed + "km, 적재량은 " + truck2.getCapacity() + "톤입니다.");	

	}

}

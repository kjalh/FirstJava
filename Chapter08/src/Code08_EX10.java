class AutoCar{
	int speed;	
}
class Sedan extends AutoCar{
	int seatNum;
	
	int upSpeed(int value) {
		speed += value;
		return speed;
	}
	int getSeatNum() {
		return seatNum;
	}
}
class Truck extends AutoCar{
	int capacity;
	
	int upSpeed(int value) {
		speed += value;
		return speed;
	}
	
	int getCapacity() {
		return capacity;
	}
}
public class Code08_EX10 {

	public static void main(String[] args) {
		Sedan sedan1 = new Sedan();
		Truck truck1 = new Truck();
		
		sedan1.upSpeed(300);
		truck1.upSpeed(100);
		
		sedan1.seatNum = 5;
		truck1.capacity = 50;
		
		System.out.println("승용차 속도는 " + sedan1.speed + "km, 좌석 수는 " + sedan1.getSeatNum() + "개입니다.");
		System.out.println("트럭 속도는 " + truck1.speed + "km, 적재량은 " + truck1.getCapacity() + "톤입니다.");

	}

}

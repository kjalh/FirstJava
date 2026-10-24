package pppp;

class AutoCar3{
	int speed;
	public void upSpeed(int s) {
		speed = s;
	}
	
}
class Sedan3 extends AutoCar3{
	int seatNum;
	
	public int getNum() {
		return seatNum;
	}
	
	
}
class Truck3 extends AutoCar3{
	int capacity;
	
	public int getCapacity() {
		return capacity;
	}
	
	
}
public class C08_10_03 {

	public static void main(String[] args) {
		Sedan3 sedan3 = new Sedan3();
		Truck3 truck3 = new Truck3();
		
		sedan3.upSpeed(300);
		truck3.upSpeed(100);
		
		sedan3.seatNum = 5;
		truck3.capacity = 50;
		
		System.out.println("승용자 속도는 " + sedan3.speed + "km, 좌석 수는 " + sedan3.getNum() + "개입니다.");
		System.out.println("트럭 속도는 " + truck3.speed + "km, 적재량은 " + truck3.getCapacity() + "톤입니다.");	
	}

}

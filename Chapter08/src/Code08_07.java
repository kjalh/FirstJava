/*abstract class Rabbit{
	String shape;
	int xPos;
	int yPos;
	
	void moce(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
}
class HouseRabbit extends Rabbit{
	
}
class MountainRabbit extends Rabbit{
	
}*/
public class Code08_07 {

	public static void main(String[] args) {
		//Rabbit rabbit = new Rabbit();
		HouseRabbit hRabbit = new HouseRabbit();
		System.out.println("집토끼 객체 생성~~~");
		MountainRabbit mRabbit = new MountainRabbit();
		System.out.println("산토끼 객체 생성~~~");

	}

}

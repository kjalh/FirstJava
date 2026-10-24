/*interface Rabbit{
	abstract void sleep();
}
class HouseRabbit implements Rabbit{
	public void sleep() {
		System.out.println("집토끼가 우리에서 잠자고 있습니다.");
	}
}
class MountainRabbit implements Rabbit{
	public void sleep() {
		System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
	}
}*/
public class Code08_09 {

	public static void main(String[] args) {
		HouseRabbit hRabbit = new HouseRabbit();
		MountainRabbit mRabbit = new MountainRabbit();
		
		hRabbit.sleep();
		mRabbit.sleep();

	}

}

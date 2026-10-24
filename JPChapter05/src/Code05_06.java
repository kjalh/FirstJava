class Weapon06{
	protected int fire() {
		return 1;
	}
}

class Cannon06 extends Weapon06{
	protected int fire() {
		return 10;
	}
}

public class Code05_06 {

	public static void main(String[] args) {
		Weapon06 weapon;
		weapon = new Weapon06();
		System.out.println("깁노 무기이 살상 능력은 " + weapon.fire());
		
		weapon = new Cannon06();
		System.out.println("대포의 살상 능력은 " + weapon.fire());

	}

}

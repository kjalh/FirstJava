
public class Code10_02 {

	static void drawDice() {
		int diceNum;
		diceNum = (int)(Math.random() * 6);
		System.out.println("결과: " + diceNum);
	}

	public static void main(String[] args) {
		System.out.println("A님, 주사위를 던집니다.");
		drawDice();
		
		System.out.println("B님, 주사위를 던집니다.");
		drawDice();

		System.out.println("C님, 주사위를 던집니다.");
		drawDice();
	}

}

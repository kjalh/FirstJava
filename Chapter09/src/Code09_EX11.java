
public class Code09_EX11 {

	public static void main(String[] args) {
		int[] dice = new int[100];
		double hap = 0;
		
		for(int i = 0; i<100; i++) {
			dice[i] = (int)(Math.random()*6+1);
			hap += dice[i];
		}
		
		System.out.printf("100번 던진 주사위 값의 평균은 %.2f입니다.", hap/100);
	}

}

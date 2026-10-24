
public class Code06_06 {

	public static void main(String[] args) {
		int hap;
		for(int i = 1; i <= 10; i++) {
//			hap초기화 안해서 안됨
			hap = hap + i;
		}
		System.out.print("1부터 10까지의 합계 : " + hap );
	}

}

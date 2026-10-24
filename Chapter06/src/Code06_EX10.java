import java.util.Scanner;
public class Code06_EX10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a, b, c;
		int sum = 0;
		
		System.out.print("초기값 ==> ");
		a = s.nextInt();
		
		System.out.print("끝값 ==> ");
		b = s.nextInt();
		
		System.out.print("증갓값 ==> ");
		c = s.nextInt();
		
		for(int i = a; i<=b; i+=c) {
			sum+=i;		
		}
		
		System.out.printf("%d부터 %d까지 %d씩 증가한 합계는 %d입니다.", a, b, c, sum);
		
		
		
	}

}

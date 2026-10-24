import java.util.Scanner;

class Code04_12_1{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}

public class Code04_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		
		double rate = scanner.nextDouble();
		
		Code04_12_1.setRate(rate);
		System.out.println("백만원은 $" + Code04_12_1.toDollar(1000000) + "입니다.");
		System.out.println("$100는 " + Code04_12_1.toKWR(100) + "원입니다.");
		
		scanner.close();

	}

}

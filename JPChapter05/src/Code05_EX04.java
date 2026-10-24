import java.util.Scanner;

abstract class Converter04 {
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio; 
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
		System.out.print(srcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + destString() + "입니다");
		scanner.close();
	}
}

class Km2Mile extends Converter04{
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	protected String srcString() {
		return "km";
	}
	protected String destString() {
		return "mile";
	}
	protected double convert(double src) {
		return src/ratio;
	}
}

public class Code05_EX04 {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

}

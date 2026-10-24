package practice;

public class 걍연습 {

	public static void main(String[] args) {
		int num;
		double num1;
		num = Integer.parseInt("100") + Integer.parseInt("200");
		
		num1 = Double.parseDouble("0.1") + Double.parseDouble("0.2");
		
		System.out.printf(num + "\t%.3f\n", num1);
		
		String a = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요.";
		
		System.out.println(a.indexOf("자바"));
		System.out.println(a.indexOf("처음", 4));
		
		String b = "자바는 재밌어요~~ Java is Funny ^^";
		String c = "";
		String b1 = "";
		
		c = b.substring(11,12).toLowerCase();
		c += b.substring(13,14).toUpperCase();
		
		System.out.println(c);
		b1=b;
		
		System.out.println(b1.toUpperCase());
		System.out.println(b1.toLowerCase());
		
		
		
		
	}
}

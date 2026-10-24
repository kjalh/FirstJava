package practice;

public class part04_EX10 {

	public static void main(String[] args) {
		String a = "자바는 재밌어요~~ Java is Funny. ^^";
		String b, c;
		System.out.println("원본 문자열 : " + a);
		
		b = a.toUpperCase();
		System.out.println("모두 대문자로 : " + b);
		
		c = b.toLowerCase();
		System.out.println("모두 소문자로 : " + c);
		
		System.out.println("Java 글자의 시작위치 : " + a.indexOf("J")); //대문자 O

	}

}

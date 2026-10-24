package practice;

public class 새로운개념3장연산자 {

	public static void main(String[] args) {
		//제곱연산 Math.pow(밑수, 지수) 꼭 double형 선언하고 해야함
		double a; 
		a = Math.pow(3,2);
		System.out.println(a);
				
		//문자형을 정수형으로 바꿔주는 함수
		int b;
		b = Integer.parseInt("100") + Integer.parseInt("200");
		System.out.println(b);
				
		//문자형 실수형으로 변화
		double c;
		c = Double.parseDouble("2.0")+ Double.parseDouble("3.0");
		System.out.println(c);
				
				
				
		double d;
		d=Math.pow(4, 2);
		System.out.print(d);

	}

}

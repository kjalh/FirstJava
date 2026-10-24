import java.util.Scanner;

public class Code04_EX11 {
	int a, b;
	int result = 0;
	
	static class Cal {
		int a, b;
		
		void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}
	
		int Add() {
			return a+b;		
		}
		int Sub() {
			return a-b;
		}
		int Mul() {
			return a*b;
		}
		int Div() {
			return a/b;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, result = 0;
		char c;
		Cal cal = new Cal();
		
	
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.next().charAt(0); //문자열의 첫 번째 글자 가져옴
		
		cal.setValue(a, b);
		
		switch (c) {
			case '+':
				result = cal.Add();
				break;
			case '-':
				result = cal.Sub();
				break;
			case '*':
				result = cal.Mul();
				break;
			case '/':
				result = cal.Div();
				break;	
		}
		System.out.print(result);
				
		
		
		
	}
	

}

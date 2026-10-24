import java.util.Scanner;

public class Code10_LAB_01 {
	static int calc(int v1, int v2, char op) {
		int result;
		switch(op) {
		case '+': result = v1 + v2; break;
		case '-': result = v1 - v2; break;
		case '*': result = v1 * v2; break;
		case '/': result = v1 / v2; break;
		default: result = 0;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int res;
		char oper;
		int num1, num2;
		
		System.out.printf("계산 입력(+,-,*,/) : ");
		oper = s.next().charAt(0);
		
		System.out.printf("첫 번재 숫자 입력 : ");
		num1 = s.nextInt();
		
		System.out.printf("두 번재 숫자 입력 : ");
		num2 = s.nextInt();
		
		res = calc(num1, num2, oper);
		System.out.println("계산 결과 : " + res);
		
		s.close();

	}
	

}

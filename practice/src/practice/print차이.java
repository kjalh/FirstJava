package practice;

import java.util.Scanner;

public class print차이 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		int c;
		System.out.print("정수1: ");
		a = s.nextInt();
		
		System.out.print("정수2: ");
		b = s.nextInt();
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		
		c = a-b;
		System.out.println( a+"\s" + "-\s" + b + "\s" + "=\s" + c );
		System.out.printf("%d x %d = %d\n", a, b, a*b);
		c = a/b;
		System.out.println(a + "/" + b + "=" + c);


	}

}

import java.util.Scanner;
public class Code03_EX11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b = 0;
		
		System.out.print("숫자1 ==> ");
		a = s.nextInt();
		System.out.print("숫자2 ==> ");
		b = s.nextInt();
		
		int sum = a+b;
		System.out.println(a + "+" + b + "=" + sum);
		System.out.println(a + "*" + b + "=" + a*b);
		System.out.println(a + "/" + b + "=" + a/b);
		System.out.println(a + "%" + b + "=" + a%b);
	}

}

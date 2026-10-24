import java.util.Scanner;

abstract class Calc11 { 
	protected int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public abstract int calculate();
}

class Add extends Calc11 {
	public int calculate() { return a+b; }
}

class Mul extends Calc11 {
	public int calculate() { return a*b; }
}

class Sub extends Calc11 {
	public int calculate() { return a-b; }
}

class Div extends Calc11 {
	public int calculate() { return a/b; }
}



public class Code05_EX11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		
		int a = s.nextInt();
		int b = s.nextInt();
		char j = s.next().charAt(0);
		
		Calc11 c;
		
		
		
		switch (j) {
			case '+': 
				c = new Add(); 
				break;
			case '-': 
				c = new Sub(); 
				break; 
			case '*': 
				c = new Mul(); 
				break;
			case '/': 
				c = new Div(); 
				break;
			default:
				return;
		}
		c.setValue(a, b);
		System.out.print(c.calculate());
	}

}

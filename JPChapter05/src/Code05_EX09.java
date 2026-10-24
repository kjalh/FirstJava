import java.util.Scanner;

interface Stack09 {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack09 implements Stack09{
	String[] stor;
	int a = 0;
	public StringStack09(int num) {//3
		stor = new String[num];//012
	}
	
	@Override
	public int length() {	
		return a;
	}

	@Override
	public int capacity() {	
		return stor.length;
	}

	@Override
	public String pop() {	
		return stor[--a]; // 보이기 전에 내림
	}

	@Override
	public boolean push(String val) {
		if(a == stor.length) {
			return false;
		}
		
		stor[a++] = val; // 저장하고 올림
		return true;
	}
	
	
}
public class Code05_EX09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0;
		String str;
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		num = s.nextInt();
		s.nextLine(); 
		
		StringStack09 stack = new StringStack09(num);
		
		while(true) {
			System.out.print("문자열 입력>> ");
			str = s.nextLine();
			
			if(str.equals("그만"))
				break;
		
			if(stack.push(str) == false) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		
		while(stack.length()>0){
			System.out.print(stack.pop() + " ");
		}
	}

}

import java.util.*;

public class Code07_EX01 {
	public static void PM(Vector<Integer> v) {
		int MAX = v.get(0);
		for(int i = 1; i < v.size(); i++) {
			if(MAX < v.get(i))
				MAX = v.get(i);
		}
		System.out.print("가장 큰 수는 " + MAX);
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true) {
			int a = s.nextInt();
			if(a == -1)
				break;
			v.add(a);
		}
		
		PM(v);

	}

}

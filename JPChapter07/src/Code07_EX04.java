import java.util.*;

public class Code07_EX04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		while(true) {
			System.out.print("강수량을 입력(0 입력시 종료)>> ");
			int a = s.nextInt();
			if(a == 0) break;
			v.add(a);
			
			for(int i = 0; i<v.size(); i++)
				System.out.print(v.get(i) + " ");
			System.out.println();
			
		}

	}

}

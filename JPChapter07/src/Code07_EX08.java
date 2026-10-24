import java.util.*;

public class Code07_EX08 {
	public static HashMap<String, Integer> pm = new HashMap<String, Integer>();
	public static Scanner s = new Scanner(System.in);
	public static int b = 0;
	public static void read() {
		
		System.out.print("이름과 포인트 입력>> ");
		String a = s.nextLine();
		if(a.equals("그만")) {
			++b;
			return;
		}
		
		StringTokenizer st = new StringTokenizer(a, " ");
		
		String name = st.nextToken().trim();
		int score = Integer.parseInt(st.nextToken().trim());
		
		if(pm.get(name) != null) {
			int uscore = pm.get(name) + score;
			pm.put(name, uscore);
		}
			
		else
			pm.put(name, score);
		
		
	}
	public static void show() {
		for (String name : pm.keySet()) {
            System.out.printf("(%s, %d)",name, pm.get(name));
        }
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println("** 포인트 관리 시스템 **");
		
		while(true) {
			read();
			if(b==1) break;
			show();
			System.out.printf("\n");
		}

	}

}

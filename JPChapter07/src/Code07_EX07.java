import java.util.*;

public class Code07_EX07 {

	public static void main(String[] args) {
		HashMap<String, Double> t = new HashMap<String, Double>();
		Scanner s = new Scanner(System.in);
		double score = 0;
		String name;
		System.out.println("미래장학금관리시스템입니다.");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("이름과 학점>> ");
			name = s.next();
			score = s.nextDouble();
			
			t.put(name, score);
		}
		
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double stand = s.nextDouble();
		System.out.print("장학생 명단 : ");
		
		Set<String> keys = t.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			name = it.next();
			score = t.get(name);
			if(score>= stand)	
				System.out.print(name + " ");
		
		}		
	}

}

import java.util.*;

public class Code07_EX03 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String str = s.next();
			if(str.equals("그만")) break;		
			int j = s.nextInt();
			nations.put(str, j);		
		}
		
		s.nextLine();
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String find = s.nextLine();
			if(find.equals("그만")) break;
			

			Integer pe = nations.get(find);
			
			if(pe == null)
				System.out.println(find + "나라는 없습니다.");
			else
				System.out.println(find + "의 인구는 " + pe);
			
		}
		
	}

}

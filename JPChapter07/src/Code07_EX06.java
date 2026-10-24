import java.util.*;

class Location06{
	private String doo, gy, we;
	
	public Location06(String doo, String gy, String we) {
		this.doo = doo;
		this.gy = gy;
		this.we = we;
	}
	
	public String gdoo() {return doo;}
	public String ggy() {return gy;}
	public String gwe() {return we;}
	
}

public class Code07_EX06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Location06> SL = new HashMap<String, Location06>();
		String a;
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			a = s.nextLine();
			StringTokenizer st = new StringTokenizer(a, ",");
			
			String doo = st.nextToken().trim();
			String gy = st.nextToken().trim();
			String we = st.nextToken().trim();
			
			Location06 Lc = new Location06(doo, gy, we);
			SL.put(doo, Lc);
		}
		
		System.out.println("------------------------------------");
		
		Set<String> keyset = SL.keySet();
		Iterator<String> it = keyset.iterator();
		
		for(int i = 0; i < 4; i++) {
			String key = it.next(); 
		    Location06 L1 = SL.get(key);
			System.out.printf("%s\t%s\t%s\n", L1.gdoo(), L1.ggy(), L1.gwe());
		}
		
		System.out.println("------------------------------------");
		
		 while(true) {
			 System.out.print("도시 이름>> ");
			 String name = s.nextLine();
			 
			 if(name.equals("그만")) break;
			 
			 Location06 L2 = SL.get(name);
			 if(L2 != null)
				 System.out.printf("%s\t%s\t%s\n", L2.gdoo(), L2.ggy(), L2.gwe());			
			 else
				 System.out.println(name + "는 없습니다.");
		 }
		
		
		
	}

}

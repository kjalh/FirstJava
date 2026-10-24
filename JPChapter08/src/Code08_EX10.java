import java.util.*;
import java.io.*;

public class Code08_EX10 {

	public static void main(String[] args) {
		File f = new File("C:\\자바_파일_저장\\8장\\phone.txt");
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner s = new Scanner(System.in);
		try {
			Scanner sf = new Scanner(f);
			
			while(sf.hasNext()) {
				String e = sf.next();
				String j = sf.next();
				hm.put(e, j);
			}
			
			System.out.println("총 " + hm.size() + "개의 전화번호를 읽었습니다.");
			
			while(true) {
				System.out.print("이름>> ");
				String find = s.nextLine();
				
				if(find.equals("그만")) break;
				
				String jun = hm.get(find);
				if(jun == null)
					System.out.println("찾는 이름이 없습니다.");
				else
					System.out.println(jun);
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}

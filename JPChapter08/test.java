import java.io.*;
import java.util.*;


public class Code08_EX11 {

	public static void main(String[] args) {
		File f = new File("C:\\자바_파일_저장\\8장\\words.txt");
		Vector<String> v = new Vector<String>();
		
		Scanner s = new Scanner(System.in);
		
		try {
			Scanner sf = new Scanner(f);
			
			while(sf.hasNext()) {
				String e = sf.next();
				v.add(e);
			}
			
			System.out.println("프로젝트 폴더 밑의 words.txt 파일을 읽었습니다.");
			
			while(true) {
				System.out.print("단어>> ");
				String find = s.nextLine();
				
				if(find.equals("그만")) {
					System.out.println("종료합니다...");
					break;
				}
				
				boolean a = false;
				for(int i = 0; i < v.size(); i++) {
					String w = v.get(i);
					if(w.length()<find.length()) continue;
					
					String view = w.substring(0, find.length());
					if(view.equals(find)){
						System.out.println(w);
						a = true;
					}
					
				}
				if(!a)
					System.out.println("발견할 수 없음");
				
			}
						
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}

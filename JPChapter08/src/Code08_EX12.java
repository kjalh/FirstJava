import java.io.*;
import java.util.*;

public class Code08_EX12 {

	public static void main(String[] args) {
		File f = null; 
		Vector<String> v = new Vector<String>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		String file = s.nextLine();
		f = new File(file);
		
		
		try {
			Scanner sf = new Scanner(new FileReader(f));
			
			while(sf.hasNext()) {
				String e = sf.nextLine();
				v.add(e);
			}
			
			
			
			while(true) {
				System.out.print("검색할 단어나 문장>> ");
				String find = s.next();
				
				boolean a = false;
				
				if(find.equals("그만")) {
					System.out.println("종료합니다...");
					break;
				}
				
				
				
				for (int i = 0; i < v.size(); i++) {
					String view = v.get(i);
					if (view.contains(find)) {
						System.out.println(i + ": " +view);
						a = true;
					}
				}
				if (!a) System.out.println("발견할 수 없음.");
			}

			System.out.println("프로그램을 종료합니다.");
						
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}

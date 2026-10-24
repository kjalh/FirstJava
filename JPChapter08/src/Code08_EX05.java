import java.io.*;
import java.util.*;

public class Code08_EX05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String fi, se;
		int a = 0;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫 번째 파일 이름을 입력하세요>> ");
		fi = s.nextLine();
		
		System.out.print("두 번째 파일 이름을 입력하세요>> ");
		se = s.nextLine();
		
		System.out.printf("%s와 %s를 비교합니다.\n", fi, se);
		
		try {
			FileInputStream fis01 = new FileInputStream(fi);
			FileInputStream fis02 = new FileInputStream(se);
			
			while(s.hasNext()) {
				int line1 = fis01.read();
				int line2 = fis02.read();
				
				if(line1 != line2) break;
				else
					a = 1;
				
				if (line1 == -1 && line2 == -1) {
                    break;
                }
				
			}
			fis01.close();
			fis02.close();
			if(a == 0)
				System.out.println("파일이 같습니다.");
			else
				System.out.println("파일이 다릅니다.");
			
			
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
		

	}

}

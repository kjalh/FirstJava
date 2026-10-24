import java.io.*;
import java.util.*;

public class Code08_EX06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String fi, se;
		int a = 0;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫 번째 파일 이름을 입력하세요>> ");
		fi = s.nextLine();
		
		System.out.print("두 번째 파일 이름을 입력하세요>> ");
		se = s.nextLine();
		
		try {
			FileInputStream fis01 = new FileInputStream(fi);
			FileInputStream fis02 = new FileInputStream(se);
			FileWriter fw = new FileWriter("C:\\자바_파일_저장\\8장\\appended.txt");
			
			
			int line;
			
			while((line = fis01.read()) != -1) {
				line = fis01.read();
				fw.write(line);
				
			}
			fis01.close();
			while((line = fis02.read()) != -1) {
				line = fis02.read();
				fw.write(line);
				
			} 
			fis02.close();
			fw.close();
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
			
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}

	}

}

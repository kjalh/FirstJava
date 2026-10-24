import java.io.*;
import java.util.*;

public class Code08_EX01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("전화번호 입력 프로그램입니다.");
		
		 try {
	            FileWriter out = new FileWriter("c:\\자바_파일_저장\\8장\\phone.txt");

	            while (true) {
	                System.out.print("이름 전화번호>> ");
	                String line = s.nextLine();
	                if (line.equals("그만")) break;

	                out.write(line + "\n");
	            }
	            System.out.println("c:\\자바_파일_저장\\8장\\phone.txt에 저장하였습니다.");

	            out.close();
	        } catch (IOException e) {
	            System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
	        }

	        s.close();

	}

}

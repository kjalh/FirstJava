import java.util.Scanner;
public class Code05_LAB03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.printf("출생 연도를 입력하세요 ==> ");
		year = s.nextInt();
		
		switch(year%12) {
		case 0: System.out.print("원숭이띠"); break;
		case 1: System.out.print("닭띠"); break;
		case 2: System.out.print("개띠"); break;
		case 3: System.out.print("돼지띠"); break;
		case 4: System.out.print("쥐띠"); break;
		case 5: System.out.print("소띠"); break;
		case 6: System.out.print("호랑이띠"); break;
		case 7: System.out.print("토끼띠"); break;
		case 8: System.out.print("용띠"); break;
		case 9: System.out.print("뱀띠"); break;
		case 10: System.out.print("말띠"); break;
		case 11: System.out.print("양띠"); break;
		}
		s.close();
	}

}

import java.util.Scanner;

public class Code02_12 {

	public static void main(String[] args) {
		char grade = 0; // = 0 없으면 마지막 출력 grade에서 오류남 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		
		int score = scanner.nextInt();
		if(score>=90)
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'F';
		System.out.println("학점은 " + grade + "입니다.");
		
		scanner.close();
	}

}

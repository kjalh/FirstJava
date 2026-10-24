import java.util.Scanner;
public class Code09_LAB_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] score = new int[5];
		int hap = 0;
		double avg;
		
		for(int i=0; i<5; i++) {
			System.out.print("평가 점수 ==> ");
			score[i] = s.nextInt();
		}
		
		for(int i = 0; i<5; i++)
			hap += score[i];
		avg = (double)hap/5;
		
		System.out.printf("심사위원 평균 점수 : %5.2f", avg);
		s.close();

	}

}

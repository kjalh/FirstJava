import java.util.Scanner;
class Day{
		private String work;
		public void set(String work) {this.work = work;}
		public String get() {return work;}
		public void show() {
			if(work == null) System.out.println("업습니다.");
			else System.out.println(work + "입니다.");
		}	
	}
	

public class Code04_EX07 {
	
	static class MonthSchedule {
		Scanner s = new Scanner(System.in);
		int day, cho;
		String work;
		Day[] days = new Day[30];
		
		
		
		public MonthSchedule(int day) {
			this.day = day;
			for (int i = 0; i < 30; i++) 
				days[i] = new Day();
		}
		void input() {
			
			System.out.print("날짜(1~30? )");
			day = s.nextInt();
			s.nextLine();
			System.out.print("할일(빈칸없이입력) ");
			work= s.nextLine();
			
			days[day-1].set(work);
		}
		
		void view() {
			System.out.print("날짜(1~30)? ");
			day = s.nextInt();
			System.out.print(day+"일의 할일은 ");
			days[day-1].show();
		}
		
		void finish() {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		
		void run() {
			System.out.println("이번달 스케쥴 관리 프로그램");
			
			while(true) {
				System.out.print("할일(입력:1, 보기: 2, 끝내기:3) >> ");
				cho = s.nextInt();
				
				if(cho == 1) input();
				else if(cho == 2) view();
				else if(cho == 3) finish();
			}

		}
		
		
		
	}
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		
		april.run();
		
	}

}

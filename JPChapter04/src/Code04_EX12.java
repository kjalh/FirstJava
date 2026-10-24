import java.util.Scanner;

class con_reservation{
	Scanner s = new Scanner(System.in);
	
	String [][]seat = new String[3][11];
	
	
		
	public con_reservation() {
		seat[0][0] = "S>>";
		seat[1][0] = "A>>";
		seat[2][0] = "B>>";
		for(int i = 0; i < 3; i++)
			for(int j = 1; j < 11; j++)
				seat[i][j] = " ---";
		
	}
	void reserve() {
		int seatarea, seatnum;
		String name;
		
		while(true) {
			System.out.print("좌석구분 S(1), A(2), B(3)>> ");
			seatarea = s.nextInt();
			if(seatarea < 3 && seatarea > 0)
				break;
			System.out.println("없는 메뉴");
		}
		seatarea-=1;
		
		
		for(int i = 0; i<10; i++)
			System.out.print(seat[seatarea][i]);
		System.out.print("\n");
		
		System.out.print("이름>> ");
		s.nextLine();
		name = s.nextLine();
		while(true) {
			System.out.print("번호>> ");
			seatnum = s.nextInt();
			if(seatnum < 11 && seatnum > 0)
				break;
			System.out.println("없는 번호");
		}

		seat[seatarea][seatnum] = name;
		
		
		
	}
	void view() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 11; j++)
				System.out.print(seat[i][j]);
			System.out.print("\n");
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
			
	}
	void del() {
		int seatarea;
		String name;
		
		while(true) {
			System.out.print("좌석 S:1, A:2, B:3>> ");
			seatarea = s.nextInt();
			if(seatarea < 3 && seatarea > 0)
				break;
			System.out.println("없는 메뉴");
		}
		seatarea-=1;
		
		
		for(int i = 0; i<10; i++)
			System.out.print(seat[seatarea][i]);
		System.out.print("\n");
		
		System.out.print("이름>> ");
		s.nextLine();
		name = s.nextLine();
		
		for(int i = 1; i<11;i++)
			if(seat[seatarea][i].equals(name)) {
				seat[seatarea][i] = " ---";
				break;
			}		
	}
	
}

public class Code04_EX12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		con_reservation cr = new con_reservation();
		int num;
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3 끝내기:4 >> ");
			num = s.nextInt();
			if(num == 1) cr.reserve();
			else if(num == 2) cr.view();
			else if(num == 3) cr.del();
			else if(num == 4)
				break;
			else {
				System.out.print("없는 메뉴\n");
			}
		}
		
		s.close();
		
	}

}



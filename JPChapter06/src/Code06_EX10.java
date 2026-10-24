import java.util.Scanner;

class Person10{
	private String name;
	
	public Person10(String name) {
		this.name = name;
	}
	
	public String gname() {
		return name;
	}
	
	
}
public class Code06_EX10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int []r = new int[3];
		
		System.out.print("1번째 선수 이름>> ");
		String n1 = s.nextLine();
		Person10 p1 = new Person10(n1);
		
		System.out.print("2번째 선수 이름>> ");
		String n2 = s.nextLine();
		Person10 p2 = new Person10(n2);
		
		while(true) {
			System.out.printf("[%s]: <Enter> ", p1.gname());
			s.nextLine();
			for(int i = 0; i<3; i++) {
				r[i] = (int)(Math.random()*3+1);
				System.out.print("\t"+ r[i] + "\t");
			}
			
			if(r[0]==r[1]&&r[1]==r[2]) {
				System.out.printf("%s님이 이겼습니다.", p1.gname());
				break;
			}
			else
				System.out.printf("아쉽군요!\n");
			
			System.out.printf("[%s]: <Enter> ", p2.gname());
			s.nextLine();
			for(int i = 0; i<3; i++) {
				r[i] = (int)(Math.random()*3+1);
				System.out.print("\t"+ r[i] + "\t");
			}
			
			if(r[0]==r[1]&&r[1]==r[2]) {
				System.out.printf("%s님이 이겼습니다.", p2.gname());
				break;
			}
			else
				System.out.printf("아쉽군요!\n");
			
		}

	}

}

import java.util.Scanner;

class Person12{
	private String name;
	
	public Person12(String name) {
		this.name = name;
	}
	
	public String gname() {
		return name;
	}
	
	
}
public class Code06_EX12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("겜블링 게임에 참여할 선수 숫자>> ");
		int num = s.nextInt();
		s.nextLine();
		Person12[] p = new Person12[num];
		
		int []r = new int[3];
		
		for(int i = 0; i<num;i++) {
			System.out.printf("%d번째 선수 이름>> ", i+1);
			String name = s.nextLine();
			p[i] = new Person12(name);
		}
		
		
		
		while(true) {
			int a = 1;
			for(int j = 0; j<num;j++) {
				Person12 pj = p[j];
				
				System.out.printf("[%s]: <Enter> ", pj.gname());
				s.nextLine();
				for(int i = 0; i<3; i++) {
					r[i] = (int)(Math.random()*3+1);
					System.out.print("\t"+ r[i] + "\t");
				}
				
				if(r[0]==r[1]&&r[1]==r[2]) {
					System.out.printf("%s님이 이겼습니다.", pj.gname());
					a=0;
					break;
				}
				else 
					System.out.printf("아쉽군요!\n");
	
			}
			if(a==0) break;
		
		}

	}

}

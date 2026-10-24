import java.util.*;

class Student07{
	private int id;
	private String tel;
	public Student07(int id, String tel) {this.id = id; this.tel = tel;}
	public int getId() {return id;}
	public String getTel() {return tel;}
}
public class Code07_07 {

	public static void main(String[] args) {
		HashMap<String, Student07> map = new HashMap<String, Student07>();	
		map.put("황기태", new Student07(1, "010-111-1111")); 
		map.put("이재문", new Student07(2, "010-222-2222"));
		map.put("김남윤", new Student07(3, "010-333-3333"));
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름? ");
			String name = s.nextLine();
			if(name.equals("exit"))
				break;
			Student07 student = map.get(name);
			
			if(student == null)
				System.out.println(name + "은 없는 사람입니다.");
			else
				System.out.println("id: " + student.getId() + ",  전화: " + student.getTel());
		}
		s.close();
	}

}

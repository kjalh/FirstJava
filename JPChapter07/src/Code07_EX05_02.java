import java.util.*;

class Student05_02 {
	private String name, major, num;
	private double avg;

	public Student05_02(String name, String major, String num, double avg) {
		this.name = name;
		this.major = major;
		this.num = num;
		this.avg = avg;
	}

	public String gname() { return name; }
	public String gmajor() { return major; }
	public String gnum() { return num; }
	public double gavg() { return avg; }

	public void print() {
		System.out.println(name + ", " + major + ", " + num + ", " + avg);
	}
}

public class Code07_EX05_02 {
	public static HashMap<String, Student05_02> read() {
		Scanner s = new Scanner(System.in);
		HashMap<String, Student05_02> studentMap = new HashMap<>();

		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String t = s.nextLine();
			StringTokenizer st = new StringTokenizer(t, ",");

			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String num = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());

			Student05_02 student = new Student05_02(name, major, num, avg);
			studentMap.put(name, student); 
		}
		return studentMap;
	}

	public static void main(String[] args) {
		HashMap<String, Student05_02> studentMap = read();

		
		
		for (Student05_02 student : studentMap.values()) {
			System.out.println("-------------------------------");
			System.out.println("이름: " + student.gname());
			System.out.println("학과: " + student.gmajor());
			System.out.println("학번: " + student.gnum());
			System.out.println("학점평균: " + student.gavg());
			
		}

		
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------------------");
			System.out.print("학생 이름 >> ");
			String name = s.nextLine();
			if (name.equals("그만")) break;
			
			Student05_02 student = studentMap.get(name);
			student.print();
		}
	}
}

import java.util.*;

class Student05_01 {
	private String name, major, num;
	private double avg;

	public Student05_01(String name, String major, String num, double avg) {
		this.name = name;
		this.major = major;
		this.num = num;
		this.avg = avg;
	}

	public String gname() { return name; }
	public String gmajor() { return major; }
	public String gnum() { return num; }
	public double gavg() { return avg; }
}

public class Code07_EX05_01 {
	
	
	public static ArrayList<Student05_01> read() {
		ArrayList<Student05_01> Stu = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String t = s.nextLine();
			StringTokenizer st = new StringTokenizer(t, ",");

			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String num = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());

			Student05_01 student = new Student05_01(name, major, num, avg);
			Stu.add(student);
		}
		return Stu;
	}

	public static void main(String[] args) {
		ArrayList<Student05_01> students = read();
		Scanner s = new Scanner(System.in);

		for (Student05_01 student : students) {
			System.out.println("----------------------------------");
			System.out.println("이름:" + student.gname());
			System.out.println("학과:" + student.gmajor());
			System.out.println("학번:" + student.gnum());
			System.out.println("학점평균:" + student.gavg());

		}
		

		while (true) {
			System.out.println("----------------------------------");
			System.out.print("학생 이름 >> ");
			String name = s.nextLine();
			if (name.equals("그만")) break;

			for (Student05_01 student : students) {
				if (student.gname().equals(name)) {
					System.out.println(student.gname() + ", " + student.gmajor() + ", " + student.gnum() + ", " + student.gavg());
					break;
				}
			}
			
		}
	}
}

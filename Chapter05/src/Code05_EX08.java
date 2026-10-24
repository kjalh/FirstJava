
public class Code05_EX08 {

	public static void main(String[] args) {
		int r = (int)(Math.random()*100)+1;
		
		System.out.println("뽑힌 점수: " + r);
		
		if(r>=90) {
			System.out.println("장학생");
		}
		else if(60<=r && r<90){
			System.out.println("합격");
		}
		else
			System.out.println("불합격");
	}

}

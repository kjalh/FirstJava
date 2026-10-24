import java.util.*;

class Word { 
	private String e;
	private String k; 
	public Word(String e, String k) {
		this.e = e;
		this.k = k;
	}
	public String ge() { return e; }
	public String gk() { return k; }
	
}
public class Code07_EX12_WorldQuiz {
	Scanner s = new Scanner(System.in);
	private Vector<Word> v;
 
	public Code07_EX12_WorldQuiz() {
		v = new Vector<Word>();
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("book", "책"));
		v.add(new Word("moon", "달"));
		v.add(new Word("jump", "점프"));
		v.add(new Word("open", "열다"));
		v.add(new Word("pen", "펜"));
		v.add(new Word("run", "달리다"));
		v.add(new Word("sun", "해"));
		v.add(new Word("tree", "나무"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("cook", "요리"));
		v.add(new Word("name", "이름"));

	}
	
	
	private int mk(int ex[], int an) {
		int []n = new int[4]; 
		int index;
		for(int i=0; i<n.length; i++) {
			do {
				index = (int)(Math.random()*v.size());
			} while(index == an || exists(n, index));
			n[i] = index;
		}
 
		for(int i=0; i<n.length; i++) ex[i] = n[i];
		return (int)(Math.random()*n.length); 
	}
	
	
	private boolean exists(int n[], int index) {
		for(int i=0; i<n.length; i++) {
			if(n[i] == index)
				return true;
		}
		return false;
	}
	
	public void quiz() {
		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
		while(true) { 
			int an = (int)(Math.random()*v.size());
			String eng = v.get(an).ge(); 
			
			
			int ex[] = new int [4];
			
			int answerLoc = mk(ex, an); 
			ex[answerLoc] = an; 
 
			
			System.out.println(eng + "?");
			for(int i=0; i<ex.length; i++)
				System.out.print("(" + (i+1) + ")" + v.get(ex[i]).gk() + " "); 
			
			System.out.print(":> "); 
			try {
				int input = s.nextInt();
				if(input == -1) {
					return;
				}
				input--;

				if(input == answerLoc)
					System.out.println("Excellent !!");
				else
					System.out.println("No. !!");
			}
			catch(InputMismatchException e) { 
				s.next();
				System.out.println("숫자를 입력하세요 !!");
			}
		}
	}
	private boolean contains(String eng) {
		for(int i=0; i<v.size(); i++) 
			if(v.get(i).ge().equals(eng)) return true;
			
		return false;
	}
	
	public void insert() {
		System.out.print("현재 " + v.size() + "개 단어가 입력되어 있습니다.");
		System.out.println("영어 단어에 그만을 입력하면 테스트를 종료합니다.");
		
		while(true) {
			System.out.print("영어 한글 입력>>");
			String e = s.next();
			if(e.equals("그만")) break;
			String aa = s.next();
			
			if(contains(e)) { 
				System.out.println(e + "는 이미 있습니다!");
				continue;
			}
			
			v.add(new Word(e, aa));
		}
	}
	
	public void run() {
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		while(true) {
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
			int ch = s.nextInt();
			switch(ch) {
			case 1:
				quiz();
				System.out.println("");
				break;
			case 2:
				insert();
				System.out.println("");
				break;
			case 3:
				System.out.println("\"명품영어\"를 종료합니다.");
				return;
			}
		}	
	}
	public static void main(String[] args) {
		Code07_EX12_WorldQuiz quiz = new Code07_EX12_WorldQuiz();
		quiz.run();
	}
}
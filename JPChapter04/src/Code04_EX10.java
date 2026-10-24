import java.util.Scanner;

class Dictionary{
	private static String []kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = { "love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) { /*검색코드작성 */
		int a = 0;
		for(int i = 0; i < kor.length; i++) {		
			if(kor[i].equals(word)) {
				System.out.println(kor[i] + "는 " + eng[i]);
				return eng[i];
			}	
		}
		
		System.out.println(word + "는 저의 사전에 없습니다.");
		return word;	
	}
}
public class Code04_EX10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word;
		Dictionary dic = new Dictionary();
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어? ");
			word = s.nextLine();
						
			if(word.equals("그만"))
				break;
			
			dic.kor2Eng(word);
		}

	}

}

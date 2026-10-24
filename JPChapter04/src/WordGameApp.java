import java.util.Scanner;

class Player {
	Scanner s = new Scanner(System.in);
	int a = 3;
	public void getWordFromUser(int num) {
		//참가자 이름필드와 단어 입력 받는
		
		String[] playerName = new String[num];
		for(int i = 0; i < num; i++) {
			System.out.print("참가자의 이름을 입력하세요>> ");
			playerName[i] = s.nextLine();
		}
		int i = 0;
		String word = "아버지";
		System.out.println("시작하는 단어는 아버지입니다.");
		
		while(true) {
			
			if(i>=num) {
				i=0;
			}
			
			System.out.print(playerName[i]+">> ");
			String newWord = s.nextLine();
			checkSuccess(word, newWord);
			
			if(a==1) {
				i++;
				word = newWord;
				continue;
			}
			else if(a == 0) {
				System.out.print(playerName[i] + "이 졌습니다.");
				break;
			}
			
			
		
		}
		
	}
	public void checkSuccess(String oldWord, String newWord ) {
		//성공여부 및 게임 지속 확인
		int lastIndex = oldWord.length() - 1;
		char lastChar = oldWord.charAt(lastIndex);
		char firstChar = newWord.charAt(0);
		
		if(lastChar == firstChar) {
			a=1;
		}
		else
			a=0;				
	}

}


public class WordGameApp {
	public void WordGame() {}
	
	public void run(int num) {
		//숫자 입력 받고 배열 생성
		Player p = new Player();
		String[] playerName = new String[num];
		p.getWordFromUser(num);//사람 입력 받음
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		

		WordGameApp WG = new WordGameApp();
		int num = 0;
		
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
		num = s.nextInt();
		WG.run(num);
		
	
		
	}

}

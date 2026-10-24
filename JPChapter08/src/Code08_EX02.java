import java.io.*;
import java.util.*;

public class Code08_EX02 {

	public static void main(String[] args) {
		Vector<String> wordVector = new Vector<String>();
		
		try {
			Scanner s = new Scanner(new FileReader("c:\\자바_파일_저장\\8장\\phone.txt"));
			
			while(s.hasNext()) {
				String word = s.nextLine();
				System.out.println(word);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}

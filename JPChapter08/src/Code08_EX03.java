import java.io.*;
import java.util.*;


public class Code08_EX03 {

	public static void main(String[] args) {
		Vector<String> wordVector = new Vector<String>();
		
		try {
			Scanner s = new Scanner(new FileReader("C:\\WINDOWS\\system.ini"));
			
			while(s.hasNext()) {
				String word = s.nextLine();
				word = word.toUpperCase();
				
				System.out.println(word);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}

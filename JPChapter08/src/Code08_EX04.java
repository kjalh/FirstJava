import java.io.*;
import java.util.*;

public class Code08_EX04 {

	public static void main(String[] args) {
		Vector<String> wordVector = new Vector<String>();
		int a = 0;
		try {
			Scanner s = new Scanner(new FileReader("C:\\WINDOWS\\system.ini"));
			
			while(s.hasNext()) {
				String word = s.nextLine();
				
				System.out.printf("%4d: %s\n", ++a, word);
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}

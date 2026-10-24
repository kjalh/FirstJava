package pppp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class C11_11_05 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/normal.txt"));
		FileWriter fw = new FileWriter("c:/FirstJava/C11_11_05.txt");
		int i = 0;
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s == null)
				break;
			i++;
			fw.write(i + "행: " + s + "\n");
			System.out.printf("%d행: %s\n", i, s);
		}
		
		fw.close();
		br.close();
		
	}

}

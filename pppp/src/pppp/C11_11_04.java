package pppp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class C11_11_04 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/normal.txt"));
		FileWriter fw = new FileWriter("c:/FirstJava/C11_11_04.txt");
		String s;
		int i = 0;
		
		while(true) {
			i++;
			
			s = br.readLine();
			
			if(s == null)
				break;
			
			fw.write(i + "행: " + s + "\n");
			System.out.print(i + "행: " + s + "\n");
		}
		br.close();
		fw.close();
		
		
	}

}

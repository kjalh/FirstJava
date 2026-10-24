package pppp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class C11_11_01{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/C11_11_01.txt"));
		FileWriter fw = new FileWriter("c:/FirstJava/C11_11_c01.txt");
		String str;
		int i = 0;
		
		while(true) {
			i++;
			str = br.readLine();
			if(str == null) 	
				break;
			fw.write(i +"행은: "+ str +"\n");
		}
		br.close();
		fw.close();
		
	}
}

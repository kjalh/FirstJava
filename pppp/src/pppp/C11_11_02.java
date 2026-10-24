package pppp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class C11_11_02 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/normal.txt"));
		FileWriter fr = new FileWriter("c:/FirstJava/C11_11_c02.txt");
		
		String a="1";
		int i = 1;
		
		while(true) {
			a = br.readLine();
			if(a==null)
				break;
			fr.write(i + "행: " + a + "\n");
			i++;
		}

		br.close();
		fr.close();
	}

}

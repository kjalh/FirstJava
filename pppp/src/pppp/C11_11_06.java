package pppp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class C11_11_06 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/normal.txt"));
		FileWriter fw = new FileWriter("c:/FirstJava/C11_11_06.txt");
		int i = 0;
		String r;
		
		while(true) {
			r = br.readLine();
			
			if(r == null)
				break;
			i++;
			fw.write(i+"행: "+ r + "\n");
			System.out.print(i+"행: "+ r + "\n");
		}
		
		
	}

}
